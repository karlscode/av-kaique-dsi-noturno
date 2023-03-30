
package com.mycompany.main;

public class Juridico extends Pessoa{
    
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridico() {
    }

    public Juridico(String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\nID: " + super.id +
                "\nNome: " + super.nome +
                "\nCNPJ: " + this.cnpj +
                "\nInscricaoEstadual: " + this.inscricaoEstadual +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nCEP: " + super.endereco.cep +
                "\nLogradouro: " + super.endereco.logradouro +
                "\nNúmero: " + super.endereco.numero + 
                "\nComplemento: " + super.endereco.complemento +
                "\nCidade: " + super.endereco.cidade +
                "\nUnidade Federativa: " + super.endereco.uf;
    }
    
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
