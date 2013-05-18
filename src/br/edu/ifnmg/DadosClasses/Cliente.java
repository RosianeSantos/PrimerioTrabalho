/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.DadosClasses;

import java.util.Objects;

/**
 *
 * @author rosy
 */
public class Cliente{
    int codCliente;
    String nome;
    int cpf;
    int rg;
    int telefone;
    String email;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    String endereco;
  
    /**
     *
     */
    public Cliente(){
        codCliente = 0;
        nome = "";
        cpf = 0;
        rg = 0;
        email = "";
        telefone = 0;
        endereco = "";
        
        
    }

   

    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codCliente;
        hash = 97 * hash + Objects.hashCode(this.nome);
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
        final Cliente other = (Cliente) obj;
        if (this.codCliente != other.codCliente) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public void setNome(String nom) {
        if (nom.length()>3 && nom.length()<250){
            nome = nom;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codCliente + ", nome=" + nome + '}';
    }

    public void setRg(double parseDouble) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void setCpf(double parseDouble) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void setTelefone(double parseDouble) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
    
