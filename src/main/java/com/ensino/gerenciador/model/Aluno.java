package com.ensino.gerenciador.model;

import com.ensino.gerenciador.utils.Data;
import lombok.Setter;

import java.text.ParseException;
import java.util.Date;

public class Aluno {
    private static Integer proximoId = 1;

    private Integer id;
    @Setter private String nome;
    @Setter private Date dataNascimento;

    private static Integer setId() {
        return proximoId++;
    }

    private Date formatarDataNascimento(String dataString) throws ParseException {
        return Data.stringToDate(dataString);
    }
}
