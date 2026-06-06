package br.com.victor.models;

import br.com.victor.models.Cachorro.Cachorro;
import br.com.victor.models.Gato.Gato;
import br.com.victor.models.ModeloCarro.ModeloCarro;

public class Main3 {
    static void main() {
        Cachorro cachorro = new Cachorro();
        ModeloCarro meuCarro = new ModeloCarro();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        meuCarro.definirModelo("Uno");
        meuCarro.definirPrecos(11900, 52000, 40000);
        meuCarro.exibirInfo();
    }
}
