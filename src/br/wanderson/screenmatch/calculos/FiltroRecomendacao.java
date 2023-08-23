package br.wanderson.screenmatch.calculos;

public class FiltroRecomendacao{

    public void filtra (Classificavel classificavel){

        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta no top 10 mais assistidos");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Esta entre os recomendados");
        } else {
            System.out.println("Assistir mais tarde");
        }
    }
}
