/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ClassConexaoMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Dependentes;

/**
 *
 * @author 201811640024
 */
public class DependenteDao {

    public boolean cadastrar(Dependentes d) {
        Connection conn = ClassConexaoMysql.conectar();
        String sql = "INSERT INTO VHCursos.Dependentes(nome" + "CPF,RG,parentesco) VALUES (?,?,?,?);";
        try {

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, d.getNome());
            ps.setString(2, d.getCPF());
            ps.setString(3, d.getRG());
            ps.setString(4, d.getParentesco());

            ps.executeUpdate();

            ps.close();
            conn.close();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public List<Dependentes> recuperaTodos() {

        Connection conexao = ClassConexaoMysql.conectar();

        String sql = "SELECT * FROM VHCursos.Dependentes;";
        try {

            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            List<Dependentes> lista = new ArrayList<>();

            while (rs.next()) {

                Dependentes d = new Dependentes();

                d.setNome(rs.getString(1));   
                d.setRG(rs.getString(2));
                d.setCPF(rs.getString(3));
                d.setParentesco(rs.getString(4));


                lista.add(d);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Dependentes> pesquisaCurso(String pesquisa) {
        Connection conexao = ClassConexaoMysql.conectar();
        String sql = "SELECT *FROM VHCursos.Dependentes " + "WHERE nome LIKE ?;";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + pesquisa + "%");
            ResultSet rs = ps.executeQuery();
            List<Dependentes> lista = new ArrayList<>();
            while (rs.next()) {
                Dependentes d = new Dependentes();

                d.setNome(rs.getString(1));
                d.setRG(rs.getString(4));
                d.setCPF(rs.getString(5));
                d.setParentesco(rs.getString(4));

                lista.add(d);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean excluirEstudante(int idDependentes) {

        Connection conexao = ClassConexaoMysql.conectar();

        String sql = "DELETE FROM VHCursos.Dependentes WHERE idDependentes = ? ;";
        try {

            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, idDependentes);

            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
