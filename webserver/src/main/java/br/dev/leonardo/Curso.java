package br.dev.leonardo;

public class Curso {
    private String nome;
    private int duracao;

    public Curso() {}
    public Curso(String nome, int duracao){
        this.nome = nome;
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public getNome(){
        return nome;
    }

}
