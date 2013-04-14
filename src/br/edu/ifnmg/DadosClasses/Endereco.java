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
public class Endereco {
    private int Id;
    private String Rua;
    private int Num;
    private String Bairro;
    
    //----
    
    public Endereco(){
        Id = 0;
        Rua = "vazio";
        Num = 0;
        Bairro = "vazio";
    }

    public Endereco(int i, String rua, String num, String bairro) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    //----

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    //----

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Endereco other = (Endereco) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (!Objects.equals(this.Rua, other.Rua)) {
            return false;
        }
        if (this.Num != other.Num) {
            return false;
        }
        if (!Objects.equals(this.Bairro, other.Bairro)) {
            return false;
        }
        return true;
    }
    
    //----

    @Override
    public String toString() {
        return "Endereco{" + "Id=" + Id + ", Rua=" + Rua + ", Num=" + Num + ", Bairro=" + Bairro + '}';
    }
    
    
   

   
    
    
    
    
    
  
}