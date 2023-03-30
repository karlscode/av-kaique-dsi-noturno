
package com.mycompany.main;

public class Engenheiro extends Funcionario{
    
    private String Crea;

    public Engenheiro() {
    }

    public Engenheiro(String Crea, String cpf, String rg, String matricula, Setor setor, double salario, int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, idade, genero, id, nome, telefone, email, endereco);
        this.Crea = Crea;
    }

    @Override
    public String toString() {
        return "\nNome: " + super.nome +
                "\nCPF: " + super.cpf +
                "\nRG: " + super.rg +
                "\nMatrícula: " + super.matricula + 
                "\nSetor: " + super.setor +
                "\nSalário: " + super.salario +
                "\nCREA: " + this.Crea +
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
    
    

    public String getCrea() {
        return Crea;
    }

    public void setCrea(String Crea) {
        this.Crea = Crea;
    }
    
    
    
}
