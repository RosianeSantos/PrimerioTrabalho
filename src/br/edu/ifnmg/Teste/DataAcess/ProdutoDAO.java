/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Teste.DataAcess;

import br.edu.ifnmg.DadosClasses.Produto;
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
public class ProdutoDAO {
  private BancoDados bd;

    public ProdutoDAO() {
        bd = new BancoDados();
    }

    public boolean Salvar(Produto obj) {
        try {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into produto(nomeProduto,descricao,valorUnitario,valorVenda,estoque) values(?,?,?,?,?)");
                comando.setString(1, obj.getNomeProduto());
                comando.setString(2, obj.getDescricao());
                comando.setDouble(3, obj.getValorUnitario());
                comando.setDouble(4, obj.getValorVenda());
                comando.setDouble(5, obj.getEstoque());
                comando.executeUpdate();
                
               
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Produto Abrir(int id) {
        try {
            Produto produto = new Produto(0, "", "",0,0,0);

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from produto where idProduto = ?");
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();

            resultado.first();

            produto.setIdProduto(resultado.getInt("idProduto"));
            produto.setNomeProduto(resultado.getString("nomeProduto"));
            produto.setDescricao(resultado.getString("descricao"));
            produto.setValorUnitario(resultado.getDouble("valorUnitario"));
            produto.setValorVenda(resultado.getDouble("valorVenda"));
            produto.setEstoque(resultado.getDouble("estoque"));

            return produto;

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Produto obj) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from produtos where idProduto = ?");
            comando.setInt(0, obj.getIdProduto());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Produto> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from produto ");
            ResultSet resultado = comando.executeQuery();
            // Cria uma lista de produtos vazia
            List<Produto> produtos = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de produto vazio
                Produto tmp = new Produto();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setIdProduto(resultado.getInt("idProduto"));
                tmp.setNomeProduto(resultado.getString("nomeProduto"));
                tmp.setDescricao(resultado.getString("descricao"));
                tmp.setValorUnitario(resultado.getDouble("valorUnitario"));
                tmp.setValorVenda(resultado.getDouble("valorVenda"));
                tmp.setEstoque(resultado.getDouble("estoque"));
                // Pega o objeto e coloca na lista
                produtos.add(tmp);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Produto> buscar(Produto filtro) {
        try {
            
            String sql = "select * from produto ";
            String where = "";
            
            if(filtro.getNomeProduto().length() > 0){
                where = "nomeProduto like '%"+filtro.getNomeProduto()+"%'";
            }
            
            if (filtro.getValorUnitario() > 0) {
                if(where.length() > 0) {
                    where = where + " and ";
                }
                where = where + " valorUnitario = " + filtro.getValorUnitario();
            }
            if (filtro.getIdProduto() > 0) {
                if(where.length() > 0) 
                    where = where + " and ";
                where = where + " idProduto = " + filtro.getIdProduto();
            }
            
            if(where.length() > 0){
                sql = sql + " where " + where;
            }
            
            Statement comando = bd.getConexao().createStatement();
            
            ResultSet resultado = comando.executeQuery(sql);
            // Cria uma lista de produtos vazia
            List<Produto> produtos = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de produto vazio
                Produto tmp = new Produto();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setIdProduto(resultado.getInt("idProduto"));
                tmp.setNomeProduto(resultado.getString("nomeProduto"));
                tmp.setDescricao(resultado.getString("descricao"));
                tmp.setValorUnitario(resultado.getDouble("valorUnitario"));
                tmp.setValorVenda(resultado.getDouble("valorVenda"));
                tmp.setEstoque(resultado.getDouble("estoque"));
                // Pega o objeto e coloca na lista
                produtos.add(tmp);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
