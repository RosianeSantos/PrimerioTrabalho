/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.Teste.DataAcess;

import br.edu.ifnmg.DadosClasses.ItemVenda;
import br.edu.ifnmg.DadosClasses.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rosy
 */
public class VendaDAO {
    
    private BancoDados bd;

    public VendaDAO() {
        bd = new BancoDados();
    }

    public boolean Salvar(Venda obj) {
        try {
            if (obj.getIdVenda() == 0) {
                PreparedStatement comando = bd.getConexao().prepareStatement("insert into vendas(valorTotal, data) values(?,?)");
                comando.setDouble(1, obj.getValorTotal());
                java.sql.Date dt = new java.sql.Date(obj.getData().getTime());
                comando.setDate(2, dt);
                comando.executeUpdate();
            } else {
                PreparedStatement comando = bd.getConexao().prepareStatement("update vendas set valorTotal = ?,data = ? where id = ?");
                comando.setDouble(1, obj.getValorTotal());
                java.sql.Date dt = new java.sql.Date(obj.getData().getTime());
                comando.setDate(2, dt);
                comando.setDouble(2, obj.getIdVenda());
                comando.executeUpdate();
            }

            for (ItemVenda iv : obj.getItem()) {
                if (iv.isAtivo()) {
                    if (iv.getId() == 0) {
                        PreparedStatement comando = bd.getConexao().prepareStatement("insert into itensvenda(venda, produto, quantidade) values(?,?,?)");
                        comando.setInt(1, obj.getIdVenda());
                        comando.setInt(2, iv.getProduto().getIdProduto());
                        comando.setInt(3, iv.getQuantidade());
                        comando.executeUpdate();
                    } else {
                        PreparedStatement comando = bd.getConexao().prepareStatement("update itensvenda set produto = ?, quantidade = ? where id = ?");
                        comando.setInt(1, iv.getProduto().getIdProduto());
                        comando.setInt(2, iv.getQuantidade());
                        comando.setInt(3, obj.getIdVenda());
                        comando.executeUpdate();
                    }
                } else {
                    PreparedStatement comando = bd.getConexao().prepareStatement("delete from itensvenda where id = ?");
                    comando.setInt(1, obj.getIdVenda());
                    comando.executeUpdate();
                }
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public Venda Abrir(int id) {
        try {
            Venda venda = new Venda();

            PreparedStatement comando = bd.getConexao().prepareStatement("select * from vendas where id = ?");
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();

            resultado.first();

            venda.setIdVenda(resultado.getInt("id"));
            venda.setData(resultado.getDate("data"));
            venda.setValorTotal(resultado.getDouble("valorTotal"));

            carregaItens(id, venda);

            return venda;

        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean Apagar(Venda obj) {
        try {
            PreparedStatement comando2 = bd.getConexao().prepareStatement("delete from itensvenda where venda = ?");
            comando2.setInt(1, obj.getIdVenda());
            comando2.executeUpdate();
            
            PreparedStatement comando = bd.getConexao().prepareStatement("delete from vendas where id = ?");
            comando.setInt(1, obj.getIdVenda());
            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<Venda> listarTodos() {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from vendas ");
            ResultSet resultado = comando.executeQuery();
            // Cria uma lista de vendas vazia
            List<Venda> vendas = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de venda vazio
                Venda tmp = new Venda();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setIdVenda(resultado.getInt("id"));
                tmp.setData(resultado.getDate("data"));
                tmp.setValorTotal(resultado.getDouble("valorTotal"));
                // Pega o objeto e coloca na lista
                
                carregaItens(tmp.getIdVenda(), tmp);
                
                vendas.add(tmp);
            }
            return vendas;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Venda> buscar(Venda filtro) {
        try {
            PreparedStatement comando = bd.getConexao().prepareStatement("select * from vendas where valorTotal = ? or data = ? or id = ? ");
            comando.setDouble(1, filtro.getValorTotal());
            java.sql.Date dt = new java.sql.Date(filtro.getData().getTime());
            comando.setDate(2, dt);
            comando.setInt(3, filtro.getIdVenda());
            ResultSet resultado = comando.executeQuery();
            // Cria uma lista de vendas vazia
            List<Venda> vendas = new LinkedList<>();
            while (resultado.next()) {
                // Inicializa um objeto de venda vazio
                Venda tmp = new Venda();
                // Pega os valores do retorno da consulta e coloca no objeto
                tmp.setIdVenda(resultado.getInt("id"));
                tmp.setData(resultado.getDate("data"));
                tmp.setValorTotal(resultado.getDouble("ValorTotal"));
                // Pega o objeto e coloca na lista
                
                carregaItens(tmp.getIdVenda(), tmp);
                
                vendas.add(tmp);
            }
            return vendas;
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void carregaItens(int id, Venda venda) throws SQLException {
        PreparedStatement comando2 = bd.getConexao().prepareStatement("select * from itensvenda where venda = ?");
        comando2.setInt(1, id);
        ResultSet resultado2 = comando2.executeQuery();

        List<ItemVenda> itens = new LinkedList<>();
        ProdutoDAO prod = new ProdutoDAO();
        while (resultado2.next()) {
            ItemVenda tmp = new ItemVenda();
            tmp.setId(resultado2.getInt("id"));
            tmp.setQuantidade(resultado2.getInt("quantidade"));
            tmp.setProduto(prod.Abrir(resultado2.getInt("produto")));
            itens.add(tmp);
        }

        venda.setItem(itens);
    }
}
