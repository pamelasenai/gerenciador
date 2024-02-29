package com.ensino.gerenciador.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Data {
    public static Date stringToDate(String dataString) throws ParseException {
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        SimpleDateFormat formatoPadraoData = new SimpleDateFormat("dd/MM/yyyy");
        if (!Pattern.matches(regex, dataString)) {
            throw new ParseException("Formato de data inválido. Data deve estar no formato: DD/MM/AAAA.", 0);
        }
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
