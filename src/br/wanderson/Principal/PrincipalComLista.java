package br.wanderson.Principal;

import br.wanderson.screematch.modelos.Filme;
import br.wanderson.screematch.modelos.Serie;
import br.wanderson.screematch.modelos.Titulo;

import java.util.ArrayList;
import java.util.List;

public class PrincipalComLista {
    public static void main(String[] args) {

        Filme filme1 = new Filme("top gun", 2022);
        filme1.avalia(10);
        Serie theFlash = new Serie("The Flash", 2000);
        theFlash.avalia(9);
        Filme filmedowanderson = new Filme("vingadores", 2018);
        filmedowanderson.avalia(5);
        Filme filme2 = new Filme("cavalheiros",2000);
        filme2.avalia(8);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmedowanderson);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(theFlash);

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme && filme1.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme1.getClassificacao());
            }
        }






    }
}
