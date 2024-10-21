package br.dev.leonardo.webserver;

import java.util.ArrayList;
import java.util.List;

public class CursosManager {
    private List<Curso> cursos;

    // Construtor que inicializa a lista de cursos
    public CursosManager() {
        this.cursos = new ArrayList<>();
        this.cursos.add(new Curso("Sistema de Informação", 3000));
        this.cursos.add(new Curso("Ciência da Computação", 3000));
    }

    // Método para retornar a lista de cursos
    public List<Curso> getCursos() {
        return cursos;
    }
}

