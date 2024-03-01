package com.ensino.gerenciador.controller;

import com.ensino.gerenciador.model.Aluno;
import com.ensino.gerenciador.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> get() {
        return alunoService.buscarTodos();
    }

    @GetMapping("{id}")
    public Aluno getPorId(@PathVariable Integer id) throws Exception {
        return alunoService.buscarPorId(id);
    }

    @PostMapping
    public Aluno post(@RequestBody Aluno aluno) throws Exception {
        return alunoService.criar(aluno);
    }

    @PutMapping("{id}")
    public Aluno put(@PathVariable Integer id, @RequestBody Aluno aluno) throws Exception {
        return alunoService.editar(id, aluno);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) throws Exception {
        return alunoService.deletar(id);
    }
}
