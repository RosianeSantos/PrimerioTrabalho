/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.DadosClasses;

/**
 *
 * @author Rosy
 */
import java.util.Objects;

/**
 *
 * @author emerson
 */
public class Pagamento {
    private int Id;
    private String Nome;
    private float Juros;
    private int Status;

    //----
    
    public Pagamento(){
        Id = 0;
        Nome = "vazio";
        Juros = 0;
        Status = 1; //Significa que a forma de pagamento esta ativa!
        
    }
    
    //----

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public float getJuros() {
        return Juros;
    }

    public void setJuros(float Juros) {
        this.Juros = Juros;
    }
    
    public int getStatus() {
        return Status;
    }

    //Desativar forma de pagamento
    public void CancelarPagamento() {
        if(this.Status == 1){
            this.Status = 0;
        }else{
            System.out.print("Essa forma de pagamento já esta desativada!");
        }
    }
    //Ativar forma de pagamento
    public void AtivarPagamento(){
        if(this.Status == 0){
            this.Status = 1;
        }else{
            System.out.print("Essa forma de pagamento já esta ativada!");
        }
    
    }

    //----
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pagamento other = (Pagamento) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (Float.floatToIntBits(this.Juros) != Float.floatToIntBits(other.Juros)) {
            return false;
        }
        if (this.Status != other.Status) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "Id=" + Id + ", Nome=" + Nome + ", Juros=" + Juros + ", Status=" + Status + '}';
    }

    

}

