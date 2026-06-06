package br.com.victor.models.filme;

import br.com.victor.models.titulo.Titulo;

public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}
