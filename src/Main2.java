import br.com.victor.models.calculatempo.CalculaTempo;
import br.com.victor.models.filme.Filme;
import br.com.victor.models.serie.Serie;

public class Main2 {
    static void main() {
        Filme f1 = new Filme();
        Filme f2 = new Filme();
        Serie s1 = new Serie();
        CalculaTempo ct = new CalculaTempo();

        f1.setNome("Pecadores");
        f1.setAnoDeLancamento(2025);
        f1.setDuracaoEmMinutos(120);

        f2.setNome("Sherk");
        f2.setAnoDeLancamento(2008);
        f2.setDuracaoEmMinutos(90);

        s1.setNome("Arrow");
        s1.setAnoDeLancamento(2012);
        s1.setTemporadas(8);
        s1.setEpisodiosPorTemporada(22);
        s1.setMinutosPorEpisodio(40);

        f1.Mensagem();
        s1.Mensagem();

        ct.adicionaTempo(f1);
        ct.adicionaTempo(f2);
        System.out.println("-----------------------------------------------------------------");
        ct.getTempoTotal();
    }
}
