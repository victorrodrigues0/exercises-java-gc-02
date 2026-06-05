public class Main {
    static void main() {
    Movie movie1 = new Movie();
    Movie movie2 = new Movie();

    movie1.name = "Pecadores";
    movie1.releaseYear = 2025;
    movie1.evaluateMovie(9);
    movie1.evaluateMovie(8);

    movie1.showMovie();
    }
}
