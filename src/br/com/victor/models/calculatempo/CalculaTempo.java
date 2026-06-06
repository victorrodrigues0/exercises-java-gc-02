package br.com.victor.models.calculatempo;

import br.com.victor.models.titulo.Titulo;

public class CalculaTempo {
    private int tempoTotal = 0;

    public void adicionaTempo (Titulo titulo) { tempoTotal += titulo.getDuracaoEmMinutos(); }

    public void getTempoTotal() {
        int mes = 0, dias = 0, horas = 0, minutos = 0, resto = 0;

        mes = tempoTotal / (30 * 24 * 60);
        resto = tempoTotal % (30 * 24 * 60);
        dias = resto / (24 * 60);
        resto = resto % (24 * 60);
        horas = resto / 60;
        minutos = resto % 60;

        System.out.println(String.format("Você passará %d mes(es), %d dia(s), %d hora(s) e %d minuto(s) assistindo para completar a sua lista.", mes, dias, horas, minutos));
    }

}
