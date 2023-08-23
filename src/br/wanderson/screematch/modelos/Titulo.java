package br.wanderson.screematch.modelos;

public abstract class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int duracaoDeMinutos;
    private int totalDasAvaliacoes;


    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoDeMinutos() {
        return duracaoDeMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }


    public void setDuracaoDeMinutos(int duracaoDeMinutos) {
        this.duracaoDeMinutos = duracaoDeMinutos;
    }


    public int getTotalDasAvaliacoes (){
        return totalDasAvaliacoes;

    }

    public void exibeFichaTecnica() {

        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoDeMinutos + " minutos");
        System.out.println("Incluindo no plano: " + incluidoNoPlano);

    }


    public void avalia(double nota){

        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;

    }

    public double mediaAvaliacoes (){
        return somaDasAvaliacoes / totalDasAvaliacoes;

    }


}
