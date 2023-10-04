package org.example;

import org.example.entidades.Afiliado;
import org.example.entidades.Examenesgenerales;
import org.example.entidades.Signovital;
import org.example.validaciones.ValidacionAfiliado;
import org.example.validaciones.ValidacionSignoVital;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        ValidacionAfiliado validacionAfiliado= new ValidacionAfiliado();
        validacionAfiliado.trabajarFechas();



        Afiliado afiliado = new Afiliado();

        System.out.println("Digita el id del usuario");
        afiliado.setId(entradaTeclado.nextInt());

        System.out.println("digita el nombre:");
        afiliado.setNombres(entradaTeclado.next());

        System.out.println("digita el apellido:");
        afiliado.setApellidos(entradaTeclado.next());

        System.out.println("digita su documento:");
        afiliado.setDocumento(entradaTeclado.next());

        System.out.println("digita su ciudad:");
        afiliado.setCiudad(entradaTeclado.nextInt());

        System.out.println("digita el departamento:");
        afiliado.setDepartamento(entradaTeclado.nextInt());

        System.out.println("digita el correo electronico:");
        afiliado.setCorreoElectronico(entradaTeclado.next());

        System.out.println("digita el telefono:");
        afiliado.setNombres(entradaTeclado.next());

        Examenesgenerales examenesgenerales=new Examenesgenerales();

        System.out.println("ingrese el id de su examen:");
        examenesgenerales.setId(entradaTeclado.nextInt());

        System.out.println("ingrese el nombre de su examen:");
        examenesgenerales.setNombreExamen(entradaTeclado.next());

        System.out.println("suba la imagen de su examen:");
        examenesgenerales.setImagenExamen(entradaTeclado.next());

        Signovital signovital=new Signovital();

        System.out.println("ingrese el id de sus signos vitales");
        signovital.setId(entradaTeclado.nextInt());

        System.out.println("ingrese el nombre de sus signos vitales");
        signovital.setNombre(entradaTeclado.next());

        System.out.println("ingrese la unidad de medida de los signos vitales");
        signovital.setUnidadMedida(entradaTeclado.nextInt());






    }
}