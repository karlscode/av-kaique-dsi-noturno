
package com.mycompany.main;

public enum Genero {
    
    FEMININO('F', "Feminino"),
    MASCULINO('M', "Masculino");
    
    protected char valor;
    protected String texto;

    private Genero(char valor, String texto) {
        this.valor = valor;
        this.texto = texto;
    }

    public char getValor() {
        return valor;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
