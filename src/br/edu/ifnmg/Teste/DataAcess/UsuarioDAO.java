/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Teste.DataAcess;

import br.edu.ifnmg.DadosClasses.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rosy
 */
public class UsuarioDAO {
    private BancoDados bd;
    
    public UsuarioDAO(){
        bd = new BancoDados();
    }
    
    public boolean Salvar(Funcionario obj) {
        try {
            if (obj.getId() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into funcionario(usuario, senha) values(?,?)");
                comando.setString(4, obj.getUsuario());
                comando.setString(5, obj.getSenha());
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update funcionario set usuario = ?, senha = ? where idfuncionario = ?");
                comando.setString(4, obj.getUsuario());
                comando.setString(5, obj.getSenha());
                comando.setInt(6, obj.getId());
                comando.executeUpdate();
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public Funcionario Abrir(int codigo) throws Exception {
        try {
            Funcionario usu = new Funcionario (0,"", "");

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from usuarios where idfuncionario = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            usu.setId(resultado.getInt("idfuncionario"));
            usu.setUsuario(resultado.getString("usuario"));
            usu.setSenha(resultado.getString("senha"));
                        
            return usu;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Funcionario obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from funcionario where codmetodo = ?");
            comando.setInt(0, obj.getId());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Funcionario> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from usuarios ");
            ResultSet resultado = comando.executeQuery();
            
            List<Funcionario> usu = new LinkedList<>();
            while (resultado.next()) {
                Funcionario tmp = new Funcionario(0,"", "");
                
                tmp.setId(resultado.getInt("idusuario"));
                tmp.setUsuario(resultado.getString("usuario"));
                tmp.setSenha(resultado.getString("senha"));
                
                
                usu.add(tmp);
            }
            return usu;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Funcionario> buscar(Funcionario filtro) {
        try {
            
            String sql = "select * from usuarios ";
            String where = "";
            
            if(filtro.getNome().length() > 0){
                where = "nome like '%"+filtro.getNome()+"%'";
            }
                       
            
            if (filtro.getId() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " id = " + filtro.getId();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Funcionario> metodo = new LinkedList<>();
            while (resultado.next()) {
                
                Funcionario tmp = new Funcionario(0,"","");
                
                tmp.setId(resultado.getInt("codusuario"));
                tmp.setUsuario(resultado.getString("usuario"));
                tmp.setSenha(resultado.getString("senha"));
                
                
                metodo.add(tmp);
            }
            return metodo;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}

