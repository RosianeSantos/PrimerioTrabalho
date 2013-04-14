/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.DadosClasses;

/**
 *
 * @author Rosy
 */
public class Telefone {
    private int Id;
    private int Num;
    
    //----
    
    public Telefone(){
        Id = 0;
        Num = 0;
    }
    
    //----

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

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
        final Telefone other = (Telefone) obj;
        if (this.Id != other.Id) {
            return false;
        }
        if (this.Num != other.Num) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" + "Id=" + Id + ", Num=" + Num + '}';
    }
    
}
