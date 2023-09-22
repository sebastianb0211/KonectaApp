package org.example;

import org.example.entidades.Afiliado;
import org.example.entidades.Examenesgenerales;
import org.example.entidades.Signovital;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado= new Scanner(System.in);


        Afiliado afiliado= new Afiliado();

        afiliado.setId(123121);
        afiliado.setApellidos("guitierrez");
        afiliado.setCiudad(2);
        afiliado.setDocumento("1231245");
        afiliado.setDepartamento(4);
        afiliado.setCorreoElectronico("tacataca@gamil.com");
        afiliado.setFechaNacimiento(LocalDate.from(LocalDateTime.now()));
        afiliado.setTelefono("123 1298312");

        Signovital signovital= new Signovital();

        signovital.setId(13124);
        signovital.setFecha(LocalDateTime.now());
        signovital.setMaximoNormal(18.0);
        signovital.setNombre("Gabriela");
        signovital.setMinimoNormal(48.0);
        signovital.setUnidadMedida(33);

        Examenesgenerales examenesgenerales=new Examenesgenerales();

        examenesgenerales.setId(2342);
        examenesgenerales.setFechaExamen(LocalDateTime.now());
        examenesgenerales.setImagenExamen("esta es una imagen");
        examenesgenerales.setNombreExamen("colonoscopia");
    }
}