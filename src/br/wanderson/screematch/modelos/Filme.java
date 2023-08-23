package br.wanderson.screematch.modelos;

import br.wanderson.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

   private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes()/2;
    }
}
