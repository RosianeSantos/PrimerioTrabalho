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
 * @author emerson
 */

public class Pessoa {
    private int Id;
    private String Nome;
    private int Rg;
    private int Cpf;
    private Date Data;
    private List<Endereco> Enderecos;
    private List<Email> Emails;
    private List<Telefone> Telefones;
    
    //----
    
    public Pessoa() {
        Id = 0;
        Nome = "vazio";
        Rg = 0;
        Cpf = 0;
        Data = new Date();
        Enderecos = new LinkedList<Endereco>();
        Emails = new LinkedList<Email>();
        Telefones = new LinkedList<Telefone>();
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
        if((Nome.length()<3) || (Nome.length()>250)){
            System.out.print("O Nome é Inválido!");
        }else{
            this.Nome = Nome;
        }
    }

    public int getRg() {
        return Rg;
    }

    public void setRg(int Rg) {
        this.Rg = Rg;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        Date Datalimite = new Date(1900,01,01);
        
        if(Data.before(Datalimite)){
            System.out.print("Essa data é inválida!");
        }else{
            this.Data = Data;
        }
    }

    public List<Endereco> getEnderecos() {
        return Enderecos;
    }

    public void setEnderecos(List<Endereco> Enderecos) {
        this.Enderecos = Enderecos;
    }

    public List<Email> getEmails() {
        return Emails;
    }

    public void setEmails(List<Email> Emails) {
        this.Emails = Emails;
    }

    public List<Telefone> getTelefones() {
        return Telefones;
    }

    public void setTelefones(List<Telefone> Telefones) {
        this.Telefones = Telefones;
    }
    
    //Adicionar e Remover Endereços, Emails e Telefones
    public void addEndereco(Endereco En){
        if(!Enderecos.contains(En)){
            Enderecos.add(En);
        }
    }
    
    public void removeEndereco(Endereco En){
        if(Enderecos.contains(En)){
            Enderecos.remove(En);
        }
    }
    
    //----
    
    public void addEmail(Email Em){
        if(!Emails.contains(Em)){
            Emails.add(Em);
        }
    }
    
    public void removeEmail(Email Em){
        if(Emails.contains(Em)){
            Emails.remove(Em);
        }
    }
    
    //----
    
    public void addTelefone(Telefone Te){
        if(!Telefones.contains(Te)){
            Telefones.add(Te);
        }
    }
    
    public void removeTelefone(Telefone Te){
        if(Telefones.contains(Te)){
            Telefones.remove(Te);
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Id=" + Id + ", Nome=" + Nome + ", Rg=" + Rg + ", Cpf=" + Cpf + ", Data=" + Data + ", Enderecos=" + Enderecos + ", Emails=" + Emails + ", Telefones=" + Telefones + '}';
    }

    public void add(int i, String nome, String rg, String cpf, String data) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    
    
}

