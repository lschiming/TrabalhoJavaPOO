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
    public void alterar(Instrutor instrutor){
    
    }
       public void consultar (Instrutor instrutor){
    
    }
        public void excluir(Instrutor instrutor){
    
    }
}
