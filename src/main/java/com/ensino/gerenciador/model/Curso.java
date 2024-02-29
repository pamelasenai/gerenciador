package com.ensino.gerenciador.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Curso {
    @Getter private static List<Curso> cursosCadastrados = new ArrayList<>();
    private static Integer proximoId = 1;

    private Integer id;
    @Setter private String nome;
    @Setter private String descricao;
    @Setter private Integer cargaHoraria;

    public static Curso criar(Curso curso) throws Exception {
        if (validar(curso)) {
            curso.id = setId();
            cursosCadastrados.add(curso);
            return curso;
        }
        return null;
    }

    public static Curso editar(Integer id, Curso curso) throws Exception {
        if (validar(curso)) {
            Curso cursoCadastrado = buscarPorId(id);
            cursoCadastrado.setNome(curso.getNome());
            cursoCadastrado.setDescricao(curso.getDescricao());
            cursoCadastrado.setCargaHoraria(curso.getCargaHoraria());
            return cursoCadastrado;
        }
        return null;
    }

    public static Curso deletar(Integer id) throws Exception {
        Curso curso = buscarPorId(id);
        cursosCadastrados.remove(curso);
        return curso;
    }

    private static Integer setId() {
        return proximoId++;
    }

    private static Curso buscarPorId(Integer id) throws Exception {
        for (Curso curso : cursosCadastrados) {
            if (curso.getId().equals(id)) {
                return curso;
            }
        }
        throw new Exception("Nenhum curso encontrado com o ID informado.");
    }

    private static boolean validar(Curso curso) throws Exception {
        if (curso.getNome().isEmpty() || curso.getNome().length() < 2) {
            throw new Exception("Nome não pode estar em branco e deve conter no mínimo dois caracteres.");
        }
        if (curso.getDescricao().isEmpty() || curso.getDescricao().length() < 10) {
            throw new Exception("A descrição deve ter no mínimo 10 caracteres.");
        }
        if (curso.getCargaHoraria() < 40) {
            throw new Exception("A Carga horária deve ser de mínimo 40 horas.");
        }
        return true;
    }
}
