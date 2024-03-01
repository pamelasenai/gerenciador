package com.ensino.gerenciador.service;

import com.ensino.gerenciador.model.Curso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    public Curso criar(Curso curso) throws Exception {
        if (validar(curso)) {
            return Curso.criar(curso);
        }
        return null;
    }

    public Curso editar(Integer id, Curso curso) throws Exception {
        if (validar(curso)) {
            Curso cursoCadastrado = buscarPorId(id);
            cursoCadastrado.setNome(curso.getNome());
            cursoCadastrado.setDescricao(curso.getDescricao());
            cursoCadastrado.setCargaHoraria(curso.getCargaHoraria());
            return cursoCadastrado;
        }
        return null;
    }

    public boolean deletar(Integer id) throws Exception {
        Curso curso = buscarPorId(id);
        return Curso.deletar(curso);
    }

    public Curso buscarPorId(Integer id) throws Exception {
        return Curso.buscarPorId(id);
    }

    public List<Curso> buscarTodos() {
        return Curso.buscarTodos();
    }

    private boolean validar(Curso curso) throws Exception {
        if (curso.getNome() == null || curso.getNome().isBlank() || curso.getNome().length() < 2) {
            throw new Exception("Nome não pode estar em branco e deve conter no mínimo dois caracteres.");
        }
        if (curso.getDescricao() == null || curso.getDescricao().isBlank() || curso.getDescricao().length() < 10) {
            throw new Exception("A descrição deve ter no mínimo 10 caracteres.");
        }
        if (curso.getCargaHoraria() == null || curso.getCargaHoraria() < 40) {
            throw new Exception("A Carga horária deve ser de mínimo 40 horas.");
        }
        return true;
    }
}
