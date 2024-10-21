package br.dev.leonardo.webserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CursoController {

    private final CursosManager cursosManager;

    // Injeção de dependência do CursosManager
    public CursoController(CursosManager cursosManager) {
        this.cursosManager = cursosManager;
    }

    // Mapeamento da rota /cursos para listar os cursos
    @GetMapping("/cursos")
    public List<Curso> listarCursos() {
        return cursosManager.getCursos();
    }
}

