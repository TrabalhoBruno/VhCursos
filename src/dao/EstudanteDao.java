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
import model.Estudante;

/**
 *
 * @author 201811640024
 */
public class EstudanteDao {

    public boolean cadastrar(Estudante e) {
        Connection conn = ClassConexaoMysql.conectar();
        String sql = "INSERT INTO VHCursos.Estudantes(nome,idade,sexo,CPF,RG,endereco, telefone) VALUES (?,?,?,?,?,?,?);";
        try {

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, e.getNome());
            ps.setInt(2, e.getIdade());
            ps.setString(3, e.getSexo());
            ps.setString(4, e.getCpf());
            ps.setString(5, e.getRg());
            ps.setString(6, e.getEndereco());
            ps.setString(7,e.getTelefone());

            ps.executeUpdate();

            ps.close();
            conn.close();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public List<Estudante> recuperaEs() {

        Connection conexao = ClassConexaoMysql.conectar();

        String sql = "SELECT * FROM VHCursos.Estudantes;";
        try {

            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            List<Estudante> lista = new ArrayList<>();

            while (rs.next()) {

                Estudante e = new Estudante();
                e.setIdEstudante(rs.getInt(1));
                e.setNome(rs.getString(2));
                e.setSexo(rs.getString(3));
                e.setIdade(rs.getInt(4));
                e.setRg(rs.getString(5));
                e.setCpf(rs.getString(6));
                e.setEndereco(rs.getString(7));
                e.setTelefone(rs.getString(8));

                lista.add(e);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Estudante> pesquisaCurso(String pesquisa) {
        Connection conexao = ClassConexaoMysql.conectar();
        String sql = "SELECT *FROM VHCursos.Estudantes " + "WHERE nome LIKE ?;";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + pesquisa + "%");
            ResultSet rs = ps.executeQuery();
            List<Estudante> lista = new ArrayList<>();
            while (rs.next()) {
                Estudante e = new Estudante();
                e.setIdEstudante(rs.getInt(1));
                e.setNome(rs.getString(2));
                e.setSexo(rs.getString(3));
                e.setIdade(rs.getInt(4));
                e.setRg(rs.getString(5));
                e.setCpf(rs.getString(6));
                e.setEndereco(rs.getString(7));
                e.setTelefone(rs.getString(8));
                lista.add(e);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean excluirEstudante(int idEstudantes) {

        Connection conexao = ClassConexaoMysql.conectar();

        String sql = "DELETE FROM VHCursos.Estudantes WHERE idEstudantes = ? ;";
        try {

            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, idEstudantes);

            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}
