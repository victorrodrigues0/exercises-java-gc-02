public class Main {
    static void main() {
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
    }
}
