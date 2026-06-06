import br.com.victor.models.cachorro.Cachorro;
import br.com.victor.models.calculo.CalculadoraSalaRetangular;
import br.com.victor.models.conversor.ConversorMoeda;
import br.com.victor.models.gato.Gato;
import br.com.victor.models.modelocarro.ModeloCarro;

public class Main3 {
    static void main() {
//        Cachorro cachorro = new Cachorro();
//        ModeloCarro meuCarro = new ModeloCarro();
//
//        cachorro.emitirSom();
//        cachorro.abanarRabo();
//
//        Gato gato = new Gato();
//        gato.emitirSom();
//        gato.arranharMoveis();
//
//        meuCarro.definirModelo("Uno");
//        meuCarro.definirPrecos(11900, 52000, 40000);
//        meuCarro.exibirInfo();

//        ConversorMoeda conversor = new ConversorMoeda();
//        conversor.converterDolarParaReal(50);

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8);
        calculadora.calcularPerimetro(5, 8);
    }
}
