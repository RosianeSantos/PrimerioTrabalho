/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.DadosClasses;

/**
 *
 * @author Rosy
 */
public class ItemVenda {
    int id;
    Produto produto;
    int quantidade;
   float Valor_Produto;
    private boolean ativo;
    
    
    //-------
     public ItemVenda(){
        id = 0;
        Valor_Produto = 0;
        quantidade = 0;
    }
    //-------

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }else{
            System.out.print("Valor Inválido!");
        }
    }

    public boolean isAtivo() {
      return ativo;
    }
    
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    
}
