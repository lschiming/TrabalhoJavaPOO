/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Aluno;
import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class DaoMatricula {
    
    private Connection conn;
    
    public DaoMatricula(Connection conn) {
        this.conn = conn;
    }
    
        public void inserir(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbmatricula (cpfaluno,siglacturma,datamatricula,"
                                     + "qtdefaltas,nota)"
                                     + "VALUES (?,?,?,?,?)");
            ps.setString(1, matricula.getAluno().getCpf());
            ps.setString(2, matricula.getTurma().getSiglaTurma());
            ps.setString(3, matricula.getData());
            ps.setInt   (4, matricula.getQtdeFaltas());
            ps.setDouble(5, matricula.getNota());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbmatricula SET datamatricula = ?, qtdefaltas = ?, nota = ? "
                                     + "WHERE cpfaluno = ? AND siglacturma = ?");
            ps.setString(1, matricula.getData());
            ps.setInt   (2, matricula.getQtdeFaltas());
            ps.setDouble(3, matricula.getNota());
            ps.setString(4, matricula.getAluno().getCpf());
            ps.setString(5, matricula.getTurma().getSiglaTurma());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Matricula consultar(String cpf, Aluno a, Turma t) {
        Matricula matricula = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbmatricula WHERE cpfaluno = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                matricula = new Matricula(rs.getString("datamatricula"));
                matricula.setQtdeFaltas(rs.getInt("qtdefaltas"));
                matricula.setNota(rs.getDouble("nota"));
                t.addMatricula(matricula);
                a.setMatricula(matricula);
            }
        
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return matricula;
    }
    
    public void excluir(Matricula matricula) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbmatricula WHERE cpfaluno = ? AND siglacturma = ?");
            ps.setString(1, matricula.getAluno().getCpf());
            ps.setString(1, matricula.getTurma().getSiglaTurma());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
