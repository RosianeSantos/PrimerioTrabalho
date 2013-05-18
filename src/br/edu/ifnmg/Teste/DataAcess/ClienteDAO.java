/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Teste.DataAcess;

import br.edu.ifnmg.DadosClasses.Cliente;
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
public class ClienteDAO {
    private BancoDados bd;
    
    public ClienteDAO(){
        bd = new BancoDados();
    }
    
    public boolean Salvar(Cliente obj) {
        try {
           
                PreparedStatement comando;
            comando = bd.getConexao().prepareStatement("insert into cliente(nomeCliente,rg,cpf,endereco,email,telefone ) values(?,?,?,?,?,?)");
                comando.setString(1, obj.getNome());
                comando.setInt(2, obj.getRg());
                comando.setInt(3, obj.getCpf());
                comando.setString(4, obj.getEndereco());
                comando.setString(5, obj.getEmail());
                comando.setInt(6, obj.getTelefone());
                comando.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public Cliente Abrir(int codigo) throws Exception {
        try {
            Cliente cliente = new Cliente ();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from cliente where idcliente = ?");
            comando.setInt(1, codigo);
            ResultSet resultado = comando.executeQuery();

            resultado.first();
            
            cliente.setCodCliente(resultado.getInt("idcliente"));
            cliente.setNome(resultado.getString("nomeCliente"));
            cliente.setRg(resultado.getInt("rg"));
            cliente.setCpf(resultado.getInt("cpf"));
            cliente.setEndereco(resultado.getString("endereco"));
            cliente.setEmail(resultado.getString("email"));
            cliente.setTelefone(resultado.getInt("telefone"));
            
            return cliente;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Cliente obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from cliente where idcliente = ?");
            comando.setInt(0, obj.getCodCliente());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Cliente> listarTodos() throws Exception {
        try {
            
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from cliente ");
            ResultSet resultado = comando.executeQuery();
            
            List<Cliente> cliente = new LinkedList<>();
            while (resultado.next()) {
                Cliente tmp = new Cliente();
                
                tmp.setCodCliente(resultado.getInt("idcliente"));
                tmp.setNome(resultado.getString("nome"));
                tmp.setRg(resultado.getInt("rg"));
                tmp.setCpf(resultado.getInt("cpf"));
                tmp.setEndereco(resultado.getString("endereco"));
                tmp.setEmail(resultado.getString("email"));
                tmp.setTelefone(resultado.getInt("telefone"));
                
                
                cliente.add(tmp);
            }
            return cliente;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Cliente> buscar(Cliente filtro) throws Exception {
        try {
            
            String sql = "select * from cliente ";
            String where = "";
            
            if(filtro.getNome().length() > 0){
                where = "nomeCliente like '%"+filtro.getNome()+"%'";
            }
                       
            
            if (filtro.getCodCliente() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " idcliente = " + filtro.getCodCliente();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            
            List<Cliente> metodo = new LinkedList<>();
            while (resultado.next()) {
                
                Cliente tmp = new Cliente();
                
              tmp.setCodCliente(resultado.getInt("idcliente"));
                tmp.setNome(resultado.getString("nome"));
                tmp.setRg(resultado.getInt("rg"));
                tmp.setCpf(resultado.getInt("cpf"));
                tmp.setEndereco(resultado.getString("endereco"));
                tmp.setEmail(resultado.getString("email"));
                tmp.setTelefone(resultado.getInt("telefone"));
                        

                metodo.add(tmp);
            }
            return metodo;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}

