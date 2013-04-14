/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.DadosClasses;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Rosy
 */
public class Venda {
   int idVenda;
   double ValorTotal;
   Date data;

   
   List<ItemVenda> item;
    
    public Venda() {
        idVenda = 0;
        ValorTotal = 0;
        data = new Date();
        item = new LinkedList<ItemVenda>();
    }

    public List<ItemVenda> getItem() {
        return item;
    }

    public void setItem(List<ItemVenda> item) {
               this.item = item;
    }
    
    public void add(ItemVenda i){
        if(!item.contains(i)){
            item.add(i);
            ValorTotal += i.getProduto().getValorUnitario() * i.getQuantidade();
        }
    }
    
    public void remove(ItemVenda i){
        if(item.contains(i)){
            item.remove(i);
            ValorTotal -= i.getProduto().getValorUnitario() * i.getQuantidade();
        }
    }


    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }
   
   
    
}
