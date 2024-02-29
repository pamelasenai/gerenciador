package com.ensino.gerenciador.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Data {
    public static Date stringToDate(String dataString) throws ParseException {
        SimpleDateFormat formatoPadraoData = new SimpleDateFormat("dd/MM/yyyy");
        formatoPadraoData.setLenient(false);
        Date dataFormatada = formatoPadraoData.parse(dataString);
        return dataFormatada;
    }

    public static String dateToString(Date data) {
        SimpleDateFormat formatoPadraoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = formatoPadraoData.format(data);
        return dataString;
    }
}
