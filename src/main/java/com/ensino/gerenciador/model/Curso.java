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
    @Setter private List<Aluno> alunosMatriculados = new ArrayList<>();

    public static Curso criar(Curso curso) throws Exception {
        curso.id = gerarId();
        cursosCadastrados.add(curso);
        return curso;
    }

    public static boolean deletar(Curso curso) throws Exception {
        return  cursosCadastrados.remove(curso);
    }

    public static Curso buscarPorId(Integer id) throws Exception {
        for (Curso curso : cursosCadastrados) {
            if (curso.getId().equals(id)) {
                return curso;
            }
        }
        throw new Exception("Nenhum curso encontrado com o ID informado.");
    }

    public static List<Curso> buscarTodos() {
        return Curso.getCursosCadastrados();
    }

    public static Integer gerarId() {
        return proximoId++;
    }

    public static void matricular(Curso curso, Aluno aluno) {
        curso.getAlunosMatriculados().add(aluno);
    }

    public static void cancelarMatricula(Curso curso, Aluno aluno) {
        curso.getAlunosMatriculados().remove(aluno);
    }
}
