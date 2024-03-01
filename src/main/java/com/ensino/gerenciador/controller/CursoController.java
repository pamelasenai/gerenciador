package com.ensino.gerenciador.controller;

import com.ensino.gerenciador.model.Curso;
import com.ensino.gerenciador.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> get() throws Exception {
        return cursoService.buscarTodos();
    }

    @GetMapping("{id}")
    public Curso getPorId(@PathVariable Integer id) throws Exception {
        return cursoService.buscarPorId(id);
    }

    @PostMapping
    public Curso post(@RequestBody Curso curso) throws Exception {
        return cursoService.criar(curso);
    }

    @PutMapping("{id}")
    public Curso put(@PathVariable Integer id, @RequestBody Curso curso) throws Exception {
        return cursoService.editar(id, curso);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) throws Exception {
        return cursoService.deletar(id);
    }
}
