package com.ensino.gerenciador.service;

import com.ensino.gerenciador.model.Aluno;
import com.ensino.gerenciador.utils.Data;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class AlunoService {
    public Aluno criar(Aluno aluno) throws Exception {
        if (validar(aluno)){
            return Aluno.criar(aluno);
        }
        return null;
    }

    public Aluno editar(Integer id, Aluno aluno) throws Exception {
        if (validar(aluno)) {
            Aluno alunoCadastrado = buscarPorId(id);
            alunoCadastrado.setNome(aluno.getNome());
            alunoCadastrado.setDataNascimento(aluno.getDataNascimento());
            return alunoCadastrado;
        }
        return null;
    }

    public boolean deletar(Integer id) throws Exception {
        Aluno aluno = buscarPorId(id);
        return Aluno.deletar(aluno);
    }

    public Aluno buscarPorId(Integer id) throws Exception {
        return Aluno.buscarPorId(id);
    }

    public List<Aluno> buscarTodos() {
        return Aluno.buscarTodos();
    }

    private boolean validarDataNascimento(String dataString) throws Exception {
        try {
            Data.stringToDate(dataString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private boolean validar(Aluno aluno) throws Exception {
        if (aluno.getNome() == null || aluno.getNome().isBlank() || aluno.getNome().length() < 3) {
            throw new Exception("Nome não pode estar em branco e deve conter no mínimo três caracteres.");
        }
        if (
                aluno.getDataNascimento() == null ||
                        aluno.getDataNascimento().isBlank() ||
                        !validarDataNascimento(aluno.getDataNascimento())
        ) {
            throw new Exception(
                    "Data de nascimento não pode estar em branco e deve estar no formato: DD/MM/AAAA."
            );
        }
        return true;
    }
}
