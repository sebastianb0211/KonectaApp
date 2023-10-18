package org.example.validaciones;

import org.example.utilidades.Utilidad;

public class ValidacionExamenGeneral {
    Utilidad utilidad= new Utilidad();
    public ValidacionExamenGeneral() {
    }

    public boolean validarId(Integer id) throws Exception{

        if(id<0){
            throw new Exception("Error en el id care chimba porque es negativo");
        }
        return true;
    }

    public Boolean validarNombreExamen(String nombreExamen)throws Exception{

        if (nombreExamen.length()<10 || nombreExamen.length()>150){
            throw  new Exception(" Error en el nombre del examen no coincide ennuestro sistema");

        }
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombreExamen)){
            throw new Exception("el nombre del examen esta mal redactado");
        }
        return true;
    }

    public  Boolean validarImagenExamen (String imagenExamen)throws Exception{

        if (imagenExamen.length()>200 || imagenExamen.length()<0){
            throw  new Exception("la imagen supera o no cu,ple los requerimientos necesarios");

        }
        return true;

    }
}
