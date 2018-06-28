/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
                                     + "datainicio,datatermino,periodo,qtdvagas)"
                                     + "VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, sc);
            ps.setString(3, turma.getDescricao());
            ps.setString(4, turma.getDataInicio());
            ps.setString(5, turma.getDataTermino());
            ps.setString(6, turma.getPeriodo());
            ps.setInt   (7, turma.getQtdVagas());
//            ps.setString(8, turma.getObservacoes());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbturma SET descricao = ?, datainicio = ?, "
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
    
    public Turma consultar(String sigla, Curso curso) {
        Turma turma = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbturma WHERE siglaturma = ?");
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                turma = new Turma(rs.getString("siglaturma"),rs.getString("descricao"));
                turma.setDataInicio(rs.getString("datainicio"));
                turma.setDataTermino(rs.getString("datatermino"));
                turma.setPeriodo(rs.getString("periodo"));
                turma.setQtdVagas(rs.getInt("qtdvagas"));
                turma.setObservacoes(rs.getString("observacoes"));
                curso.addTurma(turma);
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
    
    public ArrayList<String> listarTurmasCurso(ArrayList t, String sc) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT siglaturma FROM tbturma WHERE siglacurso = ? ORDER BY siglaturma");
            ps.setString(1, sc);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                t.add(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return t;
    }
    
    public void alocaInstrutor(Turma t, Instrutor i){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbturma SET cpfinstrutor = ? WHERE siglaturma = ?");
            ps.setString(1, i.getCpf());
            ps.setString(2, t.getSiglaTurma());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void liberaInstrutor(String st){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbturma SET cpfinstrutor = NULL WHERE siglaturma = ?");
            ps.setString(1, st);
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public String consultaInstrutor(String st){
        Turma turma = null;
        String cpf = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT cpfinstrutor FROM tbturma WHERE siglaturma = ?");
            ps.setString(1, st);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                cpf = rs.getString("cpfinstrutor");
            }
        
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return cpf;
    }
}
