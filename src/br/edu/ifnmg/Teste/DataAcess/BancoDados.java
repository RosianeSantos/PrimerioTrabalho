/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Teste.DataAcess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rosy
 */
public class BancoDados {
    
    private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
    
    public BancoDados(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/teste","root","12345");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BancoDados.class.getName()).log(Level.SEVERE, null, ex);                    
        } catch (SQLException ex) {
                Logger.getLogger(BancoDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
