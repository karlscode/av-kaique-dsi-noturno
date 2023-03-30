
package com.mycompany.main;

public abstract class Fisica extends Pessoa{
    
    protected int idade;
    protected Genero genero;

    public Fisica() {
    }

    public Fisica(int idade, Genero genero, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.idade = idade;
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
}
