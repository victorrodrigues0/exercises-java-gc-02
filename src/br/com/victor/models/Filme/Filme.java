package br.com.victor.models.Filme;

import br.com.victor.models.Titulo.Titulo;

public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}
