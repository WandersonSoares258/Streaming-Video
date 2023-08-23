package br.wanderson.screenmatch.calculos;

import br.wanderson.screematch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }


    public void inclui (Titulo tempo){

        this.tempoTotal += tempo.getDuracaoDeMinutos();

    }
}
