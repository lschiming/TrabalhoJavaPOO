package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Instrutor;
import java.util.ArrayList;

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
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbinstrutor set NOME = ? , DATANASC = ? "
                    + ", RG = ? , SEXO = ? , ESTADOCIVIL = ? ,TELEFONE = ? ,CELULAR = ? "
                    + ",ENDERECO = ? , NUMERO = ? ,BAIRRO = ? ,CIDADE = ? ,ESTADO = ? "
                    + ",CEP = ? ,EMAIL = ? ,FORMACAO = ? ,AREAATUACAO = ? WHERE CPF = ?");

            ps.setString(1, instrutor.getNome());
            ps.setString(2, instrutor.getDataNasc());
            ps.setString(3, instrutor.getRg());
            ps.setString(4, instrutor.getSexo());
            ps.setString(5, instrutor.getEstadoCivil());
            ps.setString(6, instrutor.getTelefone());
            ps.setString(7, instrutor.getCelular());
            ps.setString(8, instrutor.getEndereco());
            ps.setInt(9, instrutor.getNumero());
            ps.setString(10, instrutor.getBairro());
            ps.setString(11, instrutor.getCidade());
            ps.setString(12, instrutor.getEstado());
            ps.setString(13, instrutor.getCep());
            ps.setString(14, instrutor.getEmail());
            ps.setString(15, instrutor.getFormacao());
            ps.setString(16, instrutor.getAreaAtuacao());
            ps.setString(17, instrutor.getCpf());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());

        }
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
        return instrutor;

    }

    public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TBINSTRUTOR WHERE CPF = ?");

            ps.setString(1, instrutor.getCpf());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }
    
    public ArrayList<String> listarInstrutores(ArrayList i) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT nome FROM tbinstrutor ORDER BY nome");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                i.add(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return i;
    }
    
        public Instrutor consultarNome(String nome) {
        Instrutor instrutor = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TBINSTRUTOR where "
                    + "nome = ?");

            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                instrutor = new Instrutor(rs.getString("cpf"), nome);

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
        return instrutor;

    }
}
