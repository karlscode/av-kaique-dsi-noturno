
package com.mycompany.main;

public class Medico extends Funcionario {
    
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, id, nome, telefone, email, endereco);
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\nNome: " + super.nome +
                "\nCPF: " + super.cpf +
                "\nRG: " + super.rg +
                "\nMatrícula: " + super.matricula + 
                "\nSetor: " + super.setor +
                "\nSalário: " + super.salario +
                "\nCRM: " + this.crm +
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
    
    

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    
}
