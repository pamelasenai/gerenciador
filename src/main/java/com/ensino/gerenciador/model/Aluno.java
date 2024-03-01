package com.ensino.gerenciador.model;

import com.ensino.gerenciador.utils.Data;
import lombok.Getter;
import lombok.Setter;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Aluno {
    @Getter private static List<Aluno> alunosCadastrados = new ArrayList<>();
    private static Integer proximoId = 1;

    private Integer id;
    @Setter private String nome;
    @Setter private String dataNascimento;

    public static Aluno criar(Aluno aluno) throws Exception {
        aluno.id = proximoId++;
        alunosCadastrados.add(aluno);
        return aluno;
    }

    public static boolean deletar(Aluno aluno) throws Exception {
        return alunosCadastrados.remove(aluno);
    }

    public static Aluno buscarPorId(Integer id) throws Exception {
        for (Aluno aluno : alunosCadastrados) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        throw new Exception("Nenhum aluno encontrado com o ID informado.");
    }

    public static List<Aluno> buscarTodos() {
        return Aluno.getAlunosCadastrados();
    }
}
