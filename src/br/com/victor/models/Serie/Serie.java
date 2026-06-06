package br.com.victor.models.Serie;

import br.com.victor.models.Titulo.Titulo;

public class Serie extends Titulo {
    private int temporadas = 0, episodiosPorTemporada = 0, minutosPorEpisodio = 0;

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void Mensagem() {
        System.out.println("Nome da série: " + this.getNome());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Temporadas: " + this.getTemporadas());
        System.out.println("Episodios por Temporada: " + this.getEpisodiosPorTemporada());
        System.out.println("Minutos por episodio: " + this.getMinutosPorEpisodio());
        System.out.println("Duracao em minutos: " + this.getDuracaoEmMinutos());
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
