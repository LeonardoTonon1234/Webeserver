package br.dev.leonardo.webserver;

public class Curso {
    private String nome;
    private int duracao;

    // Construtor
    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Getter para a duração
    public int getDuracao() {
        return duracao;
    }
}
