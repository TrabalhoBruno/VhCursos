/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ClassConexaoMysql;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Curso;

/**
 *
 * @author 201811640024
 */
public class CursoDao {
    public boolean cadastrar(Curso c){
        Connection conn = ClassConexaoMysql.conectar();
        String sql = "INSERT INTO VHCursos.Cursos(nome,area,codigo,horarioAulas,cargaHoraria,"
                + "valorCurso,numeroVagas,valorMensalidade) VALUES (?,?,?,?,?,?,?,?);";
         try {
           
            PreparedStatement ps
                    = conn.prepareStatement(sql);
           
            ps.setString(1, c.getNome());  
            ps.setString(2, c.getArea());
            ps.setString(3, c.getCodigo());
            ps.setString(4, c.getHorarioAula());
            ps.setString(5, c.getCargaHoraria());
            ps.setFloat(6, c.getValorCurso());
            ps.setInt(7, c.getNumeroVagas());
            ps.setFloat(8, c.getValorMensalidade());
           
           
            ps.executeUpdate();
           
            ps.close();
            conn.close();
           
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

   
    public List<Curso> recuperaCurs() {
       
        Connection conexao = ClassConexaoMysql.conectar();
       
        String sql = "SELECT * FROM VHCursos.Cursos;";
        try {
           
            PreparedStatement ps = conexao.prepareStatement(sql);
           
            ResultSet rs = ps.executeQuery();
           
            List<Curso> lista = new ArrayList<>();
           
            while (rs.next()) {
               
                Curso c = new Curso();
                c.setIdCurso(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setCodigo(rs.getString(3));
                c.setArea(rs.getString(4));
                c.setCargaHoraria(rs.getString(5));
                c.setHorarioAula(rs.getString(6));
                c.setValorCurso(rs.getFloat(7));
                c.setValorMensalidade(rs.getFloat(8));
                c.setNumeroVagas(rs.getInt(9));
               
               
                lista.add(c);
            }
           
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   
    public List<Curso> pesquisaCurso(String pesquisa) {
        Connection conexao = ClassConexaoMysql.conectar();
        String sql = "SELECT *FROM VHCursos.Cursos " + "WHERE nome LIKE ?;";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + pesquisa + "%");
            ResultSet rs = ps.executeQuery();
            List<Curso> lista = new ArrayList<>();
            while (rs.next()) {
                Curso c = new Curso();
                c.setIdCurso(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setCodigo(rs.getString(3));
                c.setArea(rs.getString(4));
                c.setCargaHoraria(rs.getString(5));
                c.setHorarioAula(rs.getString(6));
                c.setValorCurso(rs.getFloat(7));
                c.setValorMensalidade(rs.getFloat(8));
                c.setNumeroVagas(rs.getInt(9));
                lista.add(c);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

   
    public boolean excluirCurso(int idCurso) {

       
        Connection conexao = ClassConexaoMysql.conectar();
       
        String sql = "DELETE FROM VHCursos.Cursos WHERE idCursos = ? ;";
        try {
           
            PreparedStatement ps = conexao.prepareStatement(sql);
           
            ps.setInt(1, idCurso);
           
            ps.executeUpdate();
           
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return false;
    }
}
    

