package br.com.victor.models.gato;

import br.com.victor.models.animal.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando móveis");
    }
}
