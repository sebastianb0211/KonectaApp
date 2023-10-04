package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {

    public Boolean buscarCoincidencia(String expresionRegular, String cadenaTexto){
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia=patron.matcher(cadenaTexto);
        if(coincidencia.matches()){
            return true;
        }else {
            return false;
        }
    }

}
