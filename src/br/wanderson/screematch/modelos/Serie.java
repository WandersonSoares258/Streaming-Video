package br.wanderson.screematch.modelos;

import br.wanderson.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {

    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa;

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

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }


    @Override
    public int getDuracaoDeMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
