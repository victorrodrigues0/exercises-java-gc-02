public class Movie {
    String name;
    int releaseYear, review, allReviews = 0,movieDuration, countReview = 0;
    boolean isInsidePremiumPlan;

    void showMovie () {
        System.out.println("Nome do filme: " + this.name);
        System.out.println("Data de lançamento: " + this.releaseYear);
        System.out.println("Sua nota do filme: " + this.review);
        System.out.println("Nota geral do filme: " + this.allReviews / countReview);
        System.out.println("Duração do filme: " + this.movieDuration );
        System.out.println(this.isInsidePremiumPlan ? "Está no plano Premium? Sim." : "Está no plano Premium? Não.");
    }

    void evaluateMovie (int score) {
        if (score < 0 || score > 10) {
            System.out.println("A avaliação deve estar entre 0 - 10.\n");
            return;
        }
        this.review = score;
        allReviews += this.review;
        this.countReview++;
    }
}
