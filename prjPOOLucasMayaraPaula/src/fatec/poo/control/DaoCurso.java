/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class DaoCurso {

    private Connection conn;

    public DaoCurso(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbcurso(sigla, nome, datavigencia, programa,"
                    + "cargahoraria, valor, valorhorainst) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setString(3, curso.getDataVigencia());
            ps.setString(4, curso.getPrograma());
            ps.setInt(5, curso.getCargaHoraria());
            ps.setDouble(6, curso.getValor());
            ps.setDouble(7, curso.getValorHoraInstrutor());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbcurso set nome = ?, cargahoraria = ?, valor = ?, " 
                    + "datavigencia = ?, valorhorainst = ?, programa = ? where sigla = ?");

            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getCargaHoraria());
            ps.setDouble(3, curso.getValor());
            ps.setString(4, curso.getDataVigencia());
            ps.setDouble(5, curso.getValorHoraInstrutor());
            ps.setString(6, curso.getPrograma());
            ps.setString(7, curso.getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Curso consultar(String sigla) {
        Curso cs = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbCurso where"
                    + " sigla = ?");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                cs = new Curso(sigla, rs.getString("nome"));

                cs.setCargaHoraria(rs.getInt("cargahoraria"));
                cs.setValor(rs.getDouble("valor"));
                cs.setDataVigencia(rs.getString("datavigencia"));
                cs.setValorHoraInstrutor(rs.getDouble("valorhorainst"));
                cs.setPrograma(rs.getString("programa"));

            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (cs);
    }

    public void excluir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbcurso where sigla = ?");

            ps.setString(1, curso.getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public ArrayList<String> listarSiglas(ArrayList siglas) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT sigla FROM tbcurso ORDER BY sigla");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                siglas.add(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

        return siglas;
    }
}
