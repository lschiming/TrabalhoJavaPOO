package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author sartori
 */
public class DaoAluno {

    private Connection conn;

    public DaoAluno(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Aluno aluno) {

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO tbaluno(CPF,NOME,DATANASC,"
                    + "RG,SEXO,ESTADOCIVIL,TELEFONE,CELULAR,ENDERECO,NUMERO,"
                    + "BAIRRO,CIDADE,ESTADO,CEP,EMAIL,ESCOLARIDARE) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getDataNasc());
            ps.setString(4, aluno.getRg());
            ps.setString(5, aluno.getSexo());
            ps.setString(6, aluno.getEstadoCivil());
            ps.setString(7, aluno.getTelefone());
            ps.setString(8, aluno.getCelular());
            ps.setString(9, aluno.getEndereco());
            ps.setInt(10, aluno.getNumero());
            ps.setString(11, aluno.getBairro());
            ps.setString(12, aluno.getCidade());
            ps.setString(13, aluno.getEstado());
            ps.setString(14, aluno.getCep());
            ps.setString(15, aluno.getEmail());
            ps.setString(16, aluno.getEscolaridade());

            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }

    public void alterar(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbaluno set NOME = ? , DATANASC = ? "
                    + ", RG = ? , SEXO = ? , ESTADOCIVIL = ? ,TELEFONE = ? ,CELULAR = ? "
                    + ",ENDERECO = ? , NUMERO = ? ,BAIRRO = ? ,CIDADE = ? ,ESTADO = ? "
                    + ",CEP = ? ,EMAIL = ? ,ESCOLARIDADE = ? WHERE CPF = ?");

            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getDataNasc());
            ps.setString(3, aluno.getRg());
            ps.setString(4, aluno.getSexo());
            ps.setString(5, aluno.getEstadoCivil());
            ps.setString(6, aluno.getTelefone());
            ps.setString(7, aluno.getCelular());
            ps.setString(8, aluno.getEndereco());
            ps.setInt(9, aluno.getNumero());
            ps.setString(10, aluno.getBairro());
            ps.setString(11, aluno.getCidade());
            ps.setString(12, aluno.getEstado());
            ps.setString(13, aluno.getCep());
            ps.setString(14, aluno.getEmail());
            ps.setString(15, aluno.getEscolaridade());
            ps.setString(16, aluno.getCpf());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());

        }

    }

    public Aluno consultar(String cpf) {
        Aluno aluno = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from TBINSTRUTOR where "
                    + "CPF = ?");

            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                aluno = new Aluno(cpf, rs.getString("NOME"));

                aluno.setDataNasc(rs.getString("datanasc"));
                aluno.setRg(rs.getString("rg"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setEstadoCivil(rs.getString("estadocivil"));
                aluno.setTelefone(rs.getString("telefone"));
                aluno.setCelular(rs.getString("celular"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setNumero(rs.getInt("numero"));
                aluno.setBairro(rs.getString("bairro"));
                aluno.setCidade(rs.getString("cidade"));
                aluno.setEstado(rs.getString("estado"));
                aluno.setCep(rs.getString("cep"));
                aluno.setEmail(rs.getString("email"));
                aluno.setEscolaridade(rs.getString("escolaridade"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (aluno);

    }

    public void excluir(Aluno aluno) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TBINSTRUTOR WHERE CPF = ?");

            ps.setString(1, aluno.getCpf());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
