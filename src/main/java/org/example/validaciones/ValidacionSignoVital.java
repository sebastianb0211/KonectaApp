package org.example.validaciones;

import org.example.utilidades.Utilidad;

public class ValidacionSignoVital {

    Utilidad utilidad= new Utilidad();

    public ValidacionSignoVital() {
    }

    public Boolean validarId(Integer id) throws Exception{

        if(id<0){
            throw new Exception("Error en el id care chimba porque es negativo");
        }
        return true;
    }

    public Boolean validarNombre(String nombre)throws Exception{
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombre)){
            throw new Exception("el nombre del signo vital no es valido");
        }
        return true;
    }

    public  Boolean valiidartUnidadMerdida (Integer unidadMedida) throws Exception{

        if (unidadMedida<0){
            throw  new Exception("la unidad de medida ingresada no corresponde");

        }
        String expresionRegular="^[0-9]+$";

        if (!this.utilidad.buscarCoincidencia(expresionRegular, unidadMedida.toString())){

            throw new Exception("la unidad de medida ingresada no es correcta");

        }
        return true;
    }
}
