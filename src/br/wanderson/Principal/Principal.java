package br.wanderson.Principal;

import br.wanderson.screematch.modelos.Episodio;
import br.wanderson.screematch.modelos.Filme;
import br.wanderson.screematch.modelos.Serie;
import br.wanderson.screenmatch.calculos.CalculadoraDeTempo;
import br.wanderson.screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme("top gun", 2022);
        filme1.setDuracaoDeMinutos(180);
        filme1.setIncluidoNoPlano(true);


    filme1.exibeFichaTecnica();
    filme1.avalia(5);
    filme1.avalia(3);
    filme1.avalia(2);
    filme1.avalia(9);
    filme1.avalia(8.5);

        System.out.println("Media de avaliação desse filme: " + filme1.mediaAvaliacoes());
        System.out.println("Total de avaliações: "+ filme1.getTotalDasAvaliacoes());


        Serie theFlash = new Serie("The Flash", 2000);
        theFlash.setTemporadas(6);
        theFlash.setEpisodiosPorTemporada(8);
        theFlash.setAtiva(true);
        theFlash.setMinutosPorEpisodio(40);
        theFlash.exibeFichaTecnica();

        System.out.println("The Flash tem "+ theFlash.getTemporadas()+ " temporadas");
        System.out.println("São "+theFlash.getEpisodiosPorTemporada()+ " episodios por temporada, com duração de "+ theFlash.getMinutosPorEpisodio()+ " minutos cada espisodio");
        System.out.println("Tempo para maratonar The Flash " + theFlash.getDuracaoDeMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(theFlash);
        calculadora.inclui(filme1);
        System.out.println("Para assistir todos, vai levar um tempo de "+ calculadora.getTempoTotal() +" minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(10);
        episodio.setSerie(theFlash);
        episodio.setTotalDeAvaliacoes(300);
        filtro.filtra(episodio);



            Filme filmedowanderson = new Filme("vingadores", 2018);
            filmedowanderson.setDuracaoDeMinutos(200);

            Filme filme2 = new Filme("cavalheiros",2000);
            filme2.setDuracaoDeMinutos(150);



        ArrayList<Filme> listafilmes = new ArrayList<>();
        listafilmes.add(filmedowanderson);
        listafilmes.add(filme1);
        listafilmes.add(filme2);
        System.out.println("Tamanho da lista " + listafilmes.size());
        System.out.println("Primeiro filme " + listafilmes.get(0).getNome());
        System.out.println(listafilmes);
        System.out.println("ToString " + listafilmes.get(0).toString());








    }

}
