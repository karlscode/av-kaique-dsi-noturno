
package com.mycompany.main;

public enum Setor {
    ENGENHARIA("Engenheiro"),
    SAUDE("Saude"),
    JURIDICO("Juridico");
    
    protected String nomeSetor;

    private Setor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    
}
