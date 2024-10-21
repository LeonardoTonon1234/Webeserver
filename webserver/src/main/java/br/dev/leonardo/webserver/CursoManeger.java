package br.dev.leonardo.webserver;

import java.util.*;

public class CursoManeger {
    private Lista<Curso> cursos;

    public CursoManeger() {
        this.cursos = new ArrayList<>();
        this.cursos.add(new Curso("Sistemas De Informacao" , 3000));
        this.cursos.add(new Curso("Ciencia da computacao" , 3000));

    }
    public Lista<Cursos> getCursos() {
        return this.cursos;
    
    }

}
