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
        if (validar(aluno)){
            aluno.id = setId();
            alunosCadastrados.add(aluno);
        }
        return aluno;
    }

    public static Aluno editar(Integer id, Aluno aluno) throws Exception {
        if (validar(aluno)) {
            Aluno alunoCadastrado = buscarPorId(id);
            alunoCadastrado.setNome(aluno.getNome());
            alunoCadastrado.setDataNascimento(aluno.getDataNascimento());
            return alunoCadastrado;
        }
        return null;
    }

    public static Aluno buscarPorId(Integer id) throws Exception {
        for (Aluno aluno : alunosCadastrados) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        throw new Exception("Nenhum aluno encontrado com o ID informado.");
    }

    public static Aluno deletar(Integer id) throws Exception {
        Aluno aluno = buscarPorId(id);
        alunosCadastrados.remove(aluno);
        return aluno;
    }

    private static Integer setId() {
        return proximoId++;
    }

    private static boolean validarDataNascimento(String dataString) throws Exception {
        try {
            Data.stringToDate(dataString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private static boolean validar(Aluno aluno) throws Exception {
        if (aluno.getNome().isEmpty() || aluno.getNome().length() < 3) {
            throw new Exception("Nome não pode estar em branco e deve conter no mínimo três caracteres.");
        }
        if (aluno.getDataNascimento().isEmpty() || !validarDataNascimento(aluno.getDataNascimento())) {
            throw new Exception(
                    "Data de nascimento não pode estar em branco e deve estar no formato: DD/MM/AAAA."
            );
        }
        return true;
    }
}
