package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    public void alterar(Aluno aluno){
    
    }
       public void consultar (Aluno aluno){
    
    }
        public void excluir(Aluno aluno){
    
    }
}
