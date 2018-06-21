/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Curso;
import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    public void inserir(Turma turma, String sc) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbturma (siglaturma,siglacurso,descricao,"
                                     + "datainicio,datatermino,periodo,qtdvagas,observacoes)"
                                     + "VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, sc);
            ps.setString(3, turma.getDescricao());
            ps.setString(4, turma.getDataInicio());
            ps.setString(5, turma.getDataTermino());
            ps.setString(6, turma.getPeriodo());
            ps.setInt   (7, turma.getQtdVagas());
            ps.setString(8, turma.getObservacoes());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("ALTER TABLE tbturma SET descricao = ?, datainicio = ?, "
                                     + "datatermino = ?, periodo = ?, qtdvagas = ?, observacoes = ? "
                                     + "WHERE siglaturma = ?");
            ps.setString(1, turma.getDescricao());
            ps.setString(2, turma.getDataInicio());
            ps.setString(3, turma.getDataTermino());
            ps.setString(4, turma.getPeriodo());
            ps.setInt   (5, turma.getQtdVagas());
            ps.setString(6, turma.getObservacoes());
            ps.setString(7, turma.getSiglaTurma());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Turma consultar(String sigla) {
        Turma turma = null;
        Curso curso = null;
        DaoCurso dc = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbturma WHERE siglaturma = ?");
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                curso = dc.consultar(rs.getString("siglacurso"));
                turma = new Turma(sigla,rs.getString("descricao"));
                turma.setCurso(curso);
                turma.setDataInicio(rs.getString("datainicio"));
                turma.setDataTermino(rs.getString("datatermino"));
                turma.setPeriodo(rs.getString("periodo"));
                turma.setQtdVagas(rs.getInt("qtdvagas"));
                turma.setObservacoes(rs.getString("observacoes"));
            }            
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }        
        
        return turma;
    }
    
    public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbturma WHERE siglaturma = ?");
            ps.setString(1, turma.getSiglaTurma());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
