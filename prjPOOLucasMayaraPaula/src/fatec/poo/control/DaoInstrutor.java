package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Instrutor;

/**
 *
 * @author sartori
 */
public class DaoInstrutor {

    private Connection conn;

    public DaoInstrutor(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Instrutor instrutor) {

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO tbinstrutor(CPF,NOME,DATANASC,RG,SEXO,"
                    + "ESTADOCIVIL,TELEFONE,CELULAR,ENDERECO,NUMERO,BAIRRO,CIDADE,ESTADO,"
                    + "CEP,EMAIL,FORMACAO,AREAATUACAO) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, instrutor.getCpf());
            ps.setString(2, instrutor.getNome());
            ps.setString(3, instrutor.getDataNasc());
            ps.setString(4, instrutor.getRg());
            ps.setString(5, instrutor.getSexo());
            ps.setString(6, instrutor.getEstadoCivil());
            ps.setString(7, instrutor.getTelefone());
            ps.setString(8, instrutor.getCelular());
            ps.setString(9, instrutor.getEndereco());
            ps.setInt(10, instrutor.getNumero());
            ps.setString(11, instrutor.getBairro());
            ps.setString(12, instrutor.getCidade());
            ps.setString(13, instrutor.getEstado());
            ps.setString(14, instrutor.getCep());
            ps.setString(15, instrutor.getEmail());
            ps.setString(16, instrutor.getFormacao());
            ps.setString(17, instrutor.getAreaAtuacao());

            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }

    public void alterar(Instrutor instrutor) {

    }

    public Instrutor consultar(String cpf) {
        Instrutor instrutor = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TBINSTRUTOR where "
                    + "CPF = ?");

            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                instrutor = new Instrutor(cpf, rs.getString("NOME"));

            instrutor.setDataNasc(rs.getString("datanasc"));
            instrutor.setRg(rs.getString("rg"));
            instrutor.setSexo(rs.getString("sexo"));
            instrutor.setEstadoCivil(rs.getString("estadocivil"));
            instrutor.setTelefone(rs.getString("telefone"));
            instrutor.setCelular(rs.getString("celular"));
            instrutor.setEndereco(rs.getString("endereco"));
            instrutor.setNumero(rs.getInt("numero"));
            instrutor.setBairro(rs.getString("bairro"));
            instrutor.setCidade(rs.getString("cidade"));
            instrutor.setEstado(rs.getString("estado"));
            instrutor.setCep(rs.getString("cep"));
            instrutor.setEmail(rs.getString("email"));
            instrutor.setFormacao(rs.getString("formacao"));
            instrutor.setAreaAtuacao(rs.getString("areaatuacao"));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (instrutor);

    }

    public void excluir(Instrutor instrutor) {

    }
}
