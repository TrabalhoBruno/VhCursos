/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import static conexao.ClassConexaoMysql.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 201811640024
 */
public class ClassConexaoMysql {
    public static Connection conectar(){
       
    String drive = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/VHCursos?useTimezone=true&serverTimezone=UTC";
    String usuario = "root";
    String senha = "";
   
        try {
            Class.forName(drive);
            System.out.println("funcionou o driver");
            Connection conectar = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexao com o banco funcionou");
            return conectar;
        } catch (SQLException ex) {
            Logger.getLogger(ClassConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  catch (ClassNotFoundException ex) {
            Logger.getLogger(ClassConexaoMysql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    public static void main(String[] args) {
        conectar();
    }
}
