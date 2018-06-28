package fatec.poo.control;

import fatec.poo.model.APrazo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author sartori
 */
public class DaoAPrazo {
        private Connection conn;

    public DaoAPrazo(Connection conn) {
        this.conn = conn;
    }

    public void inserir(APrazo aprazo) {

    }

    public void alterar(APrazo avista) {
    
    }

    public APrazo consultar(String cpfaluno) {
        APrazo aprazo = null;

        return (aprazo);
    }

    public void excluir(APrazo aprazo) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TBAPRAZO WHERE CPF = ? ");

            ps.setString(1, aprazo.getMatricula().getAluno().getCpf());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
}
