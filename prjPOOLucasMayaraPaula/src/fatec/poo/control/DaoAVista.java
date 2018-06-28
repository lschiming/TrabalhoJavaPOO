package fatec.poo.control;

import fatec.poo.model.AVista;
import fatec.poo.model.Matricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author sartori
 */
public class DaoAVista {
    private Connection conn;

    public DaoAVista(Connection conn) {
        this.conn = conn;
    }

    public void inserir(AVista avista) {

        PreparedStatement ps = null;

        try {
            ps = conn.prepareStatement("INSERT INTO TBAVISTA (CPFALUNO, DATAMATRICULA, SIGLACTURMA, "
                    + "VALOR, AGENCIA, NCHEQUE, PREDATA) VALUES(?,?,?,?,?,?,?)");
            
            ps.setString(1, avista.getMatricula().getAluno().getCpf());
            ps.setString(2, avista.getMatricula().getData());
            ps.setString(3, avista.getMatricula().getTurma().getSiglaTurma());
            ps.setDouble(4, avista.getValor());
            ps.setInt(5, avista.getAgencia());
            ps.setInt(6, avista.getnCheque());
            ps.setString(7, avista.getPreData());


            ps.execute();

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }

    public void alterar(AVista avista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TBAVISTA SET VALOR = ? ,AGENCIA = ?, "
                    + "NCHEQUE = ?, PREDATA = ? WHERE cpfAluno = ? ");

            ps.setDouble(1, avista.getValor());
            ps.setInt(2, avista.getAgencia());
            ps.setInt(3, avista.getnCheque());
            ps.setString(4, avista.getPreData());
            ps.setString(5, avista.getMatricula().getAluno().getCpf());
                                  

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());

        }

    }

    public AVista consultar(String cpfaluno, Matricula m) {
        AVista avista = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TBAVISTA WHERE CPFALUNO = ?");

            ps.setString(1, cpfaluno);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                avista = new AVista(m);

                //avista.setDataNasc(rs.getString("datanasc"));
                //avista.setRg(rs.getString("rg"));
                //avista.setSexo(rs.getString("sexo"));

            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (avista);

    }

    public void excluir(AVista avista) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TBAVISTA WHERE CPF = ? ");

            ps.setString(1, avista.getMatricula().getAluno().getCpf());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
