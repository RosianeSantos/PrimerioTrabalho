/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.DadosClasses;

/**
 *
 * @author Rosy
 */
public class Produto {
    
    int idProduto;
    String nomeProduto;
    String descricao;
    double valorUnitario;
    double valorVenda;
    double estoque;
    
    public Produto(){
        this.idProduto = 0;
        this.nomeProduto = "";
        this.descricao = "";
        this.valorUnitario = 0;
        this.valorVenda = 0;
        this.estoque = 0;
    }
    
    public Produto(int id_, String nom, String desc, double val,double vend, double est){
        this.idProduto = id_;
        this.nomeProduto = nom;
        this.descricao = desc;
        this.valorUnitario = val;
        this.valorVenda = vend;
        this.estoque = est;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao(){
       return descricao;
    }
    public void setDescricao(String descricao){
         this.descricao = descricao;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public double getValorVenda(){
        return valorVenda;
    }
    
    public void setValorVenda(double valorVenda){
        this.valorVenda = valorVenda;
    }
    
    public double getEstoque(){
        return estoque;
    }
    
    public void setEstoque(double estoque){
        this.estoque = estoque;
    }
     
}
