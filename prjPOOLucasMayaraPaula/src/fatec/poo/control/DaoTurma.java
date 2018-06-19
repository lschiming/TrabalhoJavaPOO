/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class DaoTurma {
    
    private Connection conn;
    
    public DaoTurma(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbturma (siglaturma,siglacurso,descricao,"
                                     + "datainicio,datatermino,periodo,qtdvagas,observacoes)"
                                     + "VALUES (?,?,?,?,?,?,?,?)");
        } catch (SQLException ex) {
        }
    }
    
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
    }
    
    public Turma consultar(String sigla) {
        Turma turma = null;
        PreparedStatement ps = null;
        
        
        
        return turma;
    }
    
    public void excluir() {
        PreparedStatement ps = null;
    }
}
