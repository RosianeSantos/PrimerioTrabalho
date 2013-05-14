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
    double valorUnitario;
    double estoque;
    
    public Produto(){
        this.idProduto = 0;
        this.nomeProduto = "";
        this.valorUnitario = 0;
    }
    
    public Produto(int id_, String nom, double val){
        this.idProduto = id_;
        this.nomeProduto = nom;
        this.valorUnitario = val;
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

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
    
}
