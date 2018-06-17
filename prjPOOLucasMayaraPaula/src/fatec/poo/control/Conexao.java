
package fatec.poo.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class Conexao {
    private String connectionString, driver, usuario, senha;
    private Connection conn=null;
    
    public Conexao(String usuario, String senha) {
        this.usuario = usuario;
        this.senha   = senha;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    
    public Connection conectar() {
        
	   if (conn == null){
	      try {
                 Class.forName(driver);
              
                 conn = DriverManager.getConnection(connectionString, usuario, senha);
	         System.out.println("Conexao OK");
              } catch (Exception ex) {
                  System.out.println("Falha na Conexao");
                  System.out.println(ex.toString() + ex.getMessage());
              }
	    }
        return conn;
    }
    
    public void fecharConexao(){
        if (conn != null){
	   try {
                  conn.close();
           } catch (SQLException ex) {
                   System.out.println(ex.toString());
           }
        }
    }

}
