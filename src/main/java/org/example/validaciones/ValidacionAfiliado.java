package org.example.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {
    public ValidacionAfiliado() {
    }
    public boolean valiadarId(Integer id) throws Exception{

        if(id<0){
            throw new Exception("Error en el id care chimba porque es negativo");
        }

        return true;
    }
    public boolean validarNombre(String nombre) throws Exception{
        if (nombre.length() < 3 || nombre.length() > 40){
            throw new Exception("El numero de caracteres no es correcto debe estar entre 3 y 40");
            }
        String expresionRegular="^[a-zA-Z]+$";

        Pattern patron = Pattern.compile(expresionRegular);

        Matcher coincidencia=patron.matcher(nombre);
        if(coincidencia.matches()){
            System.out.println("Tenemos coincidencia");
            return true;
        }else {
            System.out.println("No tenemos coincidencias");
            return false;
        }

        //return true;
    }

}
