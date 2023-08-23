package br.wanderson.screematch.modelos;

import br.wanderson.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeVisualizacoes = totalDeAvaliacoes;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVisualizacoes > 100){
            return 4;

        } else {
            return 2;
        }

        }
}
