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
import model.Instrutorr;

/**
 *
 * @author 201811640024
 */
public class InstrutorDao {

    public boolean cadastrar(Instrutorr i) {

        Connection conn = ClassConexaoMysql.conectar();

        String sql = "INSERT INTO VHCursos.Instrutores(nome,cpf,rg,"
                + "DataNascimento,DataAdmissao,endereco, telefone) VALUES (?,?,?,?,?,?,?);";
        try {

            PreparedStatement ps
                    = conn.prepareStatement(sql);

            ps.setString(1, i.getNome());
            ps.setString(2, i.getCpf());
            ps.setString(3, i.getRg());
            ps.setString(4, i.getDataNascimento());
            ps.setString(5, i.getDataAdmissao());
            ps.setString(6, i.getEndereco());
            ps.setString(7, i.getTelefone());

            ps.executeUpdate();

            ps.close();
            conn.close();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public List<Instrutorr> recuperaIns() {

        Connection conexao = ClassConexaoMysql.conectar();

        String sql = "SELECT * FROM VHCursos.Instrutores;";
        try {

            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            List<Instrutorr> lista = new ArrayList<>();

            while (rs.next()) {

                Instrutorr i = new Instrutorr();
                i.setIdInstrutores(rs.getInt(1));
                i.setNome(rs.getString(2));
                i.setCpf(rs.getString(3));
                i.setRg(rs.getString(4));
                i.setDataNascimento(rs.getString(5));
                i.setDataAdmissao(rs.getString(6));
                i.setEndereco(rs.getString(7));
                i.setTelefone(rs.getString(8));

                lista.add(i);
            }

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Instrutorr> pesquisaCurso(String pesquisa) {
        Connection conexao = ClassConexaoMysql.conectar();
        String sql = "SELECT *FROM VHCursos.Instrutores " + "WHERE nome LIKE ?;";

        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + pesquisa + "%");
            ResultSet rs = ps.executeQuery();
            List<Instrutorr> lista = new ArrayList<>();
            while (rs.next()) {
                Instrutorr i = new Instrutorr();
                i.setIdInstrutores(rs.getInt(1));
                i.setNome(rs.getString(2));
                i.setCpf(rs.getString(3));
                i.setRg(rs.getString(4));
                i.setDataNascimento(rs.getString(5));
                i.setDataAdmissao(rs.getString(6));
                i.setEndereco(rs.getString(7));
                i.setTelefone(rs.getString(8));
                lista.add(i);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean excluirInstrutores(int idInstrutores) {

        Connection conexao = ClassConexaoMysql.conectar();

        String sql = "DELETE FROM VHCursos.Instrutores WHERE idInstrutores = ? ;";
        try {

            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setInt(1, idInstrutores);

            ps.executeUpdate();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
