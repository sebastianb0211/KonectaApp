package org.example.validaciones;

import org.example.utilidades.Utilidad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionAfiliado {

    Utilidad utilidad= new Utilidad(); // inyeccion de dependencia

    public ValidacionAfiliado() {
    }
    public boolean validarId(Integer id) throws Exception{

        if(id<0){
            throw new Exception("Error en el id care chimba porque es negativo");
        }

        return true;
    }
    public boolean validarNombre(String nombre) throws Exception{
        if (nombre.length() < 3 || nombre.length() > 40){
            throw new Exception("El numero de caracteres no es correcto debe estar entre 3 y 40");
            }
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombre)){
            throw new Exception("el nombre no coincide");
        }
        return true;

    }

    public Boolean validarApellido(String apellidos)throws Exception{

        if (apellidos.length()<10 || apellidos.length()>50){
            throw new Exception("los apellidos ingresados no cumplen con los requisitos");
        }
        String expresionRegular="^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,apellidos)){
            throw new Exception("el apellido no coincide");
        }
        return true;

    }

    public Boolean validarDocumento(String documento)throws Exception{
        if (documento.length()<7 || documento.length()>10){
            throw new Exception("documento con longitud invalida");
        }
        String expresionRegular="^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,documento)){
            throw new Exception("el documento no coincide");
        }
        return true;

    }

    public Boolean validarCiudad(String ciudad)throws Exception{
        if (ciudad.length()>1123 ){
            throw new Exception("la ciudad ingresada  es invalida");
        }
        String expresionRegular="^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,ciudad)){
            throw new Exception("la ciudad no coincide");
        }
        return true;
    }

    public Boolean validarDepartamento(String departamento)throws Exception{
        if (departamento.length()>32 || departamento.length()<10){
            throw new Exception("el departamento ingresado es invalido");
        }
        String expresionRegular="^[0-9]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,departamento)){
            throw new Exception("el departamento no coincide");
        }
        return true;

    }
    public Boolean validarCorreoElectronico(String correoElectronico) throws Exception{
        String expresionRegular="^[A-Za-z0-9+_.-]+@(.+)$";
        if  (!this.utilidad.buscarCoincidencia(expresionRegular,correoElectronico)){
            throw new Exception("el formato de correo electronico  no coincide");
        }
        return true;
    }

    public Boolean validarTelefono(String telefono)throws Exception{
        if(telefono.length()>10 || telefono.length()<0){
            throw new Exception("el telefono no es posible");
        }
        String expresionRegular="^[0-9]+$";
        if  (!this.utilidad.buscarCoincidencia(expresionRegular,telefono)){
            throw new Exception("el formato de correo electronico  no coincide");
        }
        return true;
    }


}
