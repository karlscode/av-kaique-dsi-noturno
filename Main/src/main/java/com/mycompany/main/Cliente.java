
package com.mycompany.main;

public class Cliente extends Fisica{
    
    private int protocoloAtendimento;

    public Cliente() {
    }

    public Cliente(int protocoloAtendimento, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(idade, genero, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return  "\nNome: " + super.nome +
                "\nID: " + super.id +
                "\nIdade: " + super.idade +
                "\nGenero: " + super.genero +
                "\nTelefone: " + super.telefone +
                "\nEmail: " + super.email +
                "\nCEP: " + super.endereco.cep +
                "\nLogradouro: " + super.endereco.logradouro +
                "\nNúmero: " + super.endereco.numero + 
                "\nComplemento: " + super.endereco.complemento +
                "\nCidade: " + super.endereco.cidade +
                "\nUnidade Federativa: " + super.endereco.uf;
    }
    
    

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    
}
