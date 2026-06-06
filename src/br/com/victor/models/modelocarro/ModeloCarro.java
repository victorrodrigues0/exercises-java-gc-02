package br.com.victor.models.modelocarro;

import br.com.victor.models.carro.Carro;

public class ModeloCarro  extends Carro {

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Preço Ano 1: " + this.getPrecoAno1());
        System.out.println("Preço Ano 2: " + this.getPrecoAno2());
        System.out.println("Preço Ano 3: " + this.getPrecoAno3());
    }
}
