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
    private int id;
    private Produto produto;
    private int quantidade;
    private float Valor_Produto;
    
    
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
    
    
}
