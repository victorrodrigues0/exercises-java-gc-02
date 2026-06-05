import br.com.victor.models.character.Character;
import br.com.victor.models.produto.Produto;

public class Main {
    static void main() {
        /*
    Movie movie1 = new Movie();
    Movie movie2 = new Movie();
    Pessoa pessoa1 = new Pessoa();
    Musica m1 = new Musica();

    movie1.name = "Pecadores";
    movie1.releaseYear = 2025;
    movie1.evaluateMovie(9);
    movie1.evaluateMovie(8);

    movie1.showMovie();

    pessoa1.saudacoes();

    m1.titulo = "Presságio de destruição";
    m1.artista = "Enygma";
    m1.anoLancamento = 2026;

    m1.exibeFicha();
         */

        Character c1 = new Character();
        Produto produto = new Produto("Celular", 2000.0);

        c1.setName("/nArcher");
        c1.setAge(290);
        c1.setGender("Masculine");
        c1.setRace("elf");
        c1.setWeapon("Bow");

        c1.showStats();

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());
    }
}
