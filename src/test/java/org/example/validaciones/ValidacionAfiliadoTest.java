package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionAfiliadoTest {

    // Para ejecutar un prueba debo instanciar un objeto de la clase que voy a probar

    ValidacionAfiliado validacionAfiliado;

    @BeforeEach  // establecesr las condiciones iniciales de cada prueba
    public void prepararPruebas() {
        this.validacionAfiliado = new ValidacionAfiliado();
    }

    @Test
    public void validarIdCorrecto() {
        //1. preparar
        Integer idPrueba = 50;
        //2. ejecutar
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarId(idPrueba));

        //3. verificar
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarIdIncorrecto() {
        //1.Preparar
        Integer idPrueba = -50;
        //2.Ejecutar
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarId(idPrueba));
        //3.Verificar
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensaje(), resultado.getMessage());
    }

    @Test
    public void validarNombreCorrecto() {
        String nombrePrueba = "sebastian Betancur";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarNombre(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarNombreIncorrectoTipoCaracteres() {
        String nombrePrueba = "sebastian123";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarNombre(nombrePrueba));
        Assertions.assertEquals("el nombre no coincide", resultado.getMessage());
    }

    @Test
    public void ValidarNombreIncorrectoLongitud() {
        String nombrePrueba = "se";


        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarNombre(nombrePrueba));
        Assertions.assertEquals("El numero de caracteres no es correcto debe estar entre 3 y 40", resultado.getMessage());


    }

    @Test
    public void ValidarNombreIncorrectoLargo() {
        String nombrePruebaDos = "12345678900987654323456789098765432123456789876543234567898765432345678987654334567";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarNombre(nombrePruebaDos));
        Assertions.assertEquals("El numero de caracteres no es correcto debe estar entre 3 y 40", resultado.getMessage());

    }

    @Test
    public void validarApellidoCorrecto() {
        String apellidoPrueba = "betancur carvalho";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarApellido(apellidoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarApellidoIncorrectoTipoCaracteres() {
        String apellidoPrueba = "sebastian123";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarApellido(apellidoPrueba));
        Assertions.assertEquals("el apellido no coincide", resultado.getMessage());
    }

    @Test
    public void ValidarApellidoIncorrectoLongitud() {
        String apellidoPrueba = "se";


        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarApellido(apellidoPrueba));
        Assertions.assertEquals("los apellidos ingresados no cumplen con los requisitos", resultado.getMessage());


    }

    @Test
    public void ValidarApellidoIncorrectoLargo() {
        String apellidoPruebaDos = "12345678900987654323456789098765432123456789876543234567898765432345678987654334567";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarApellido(apellidoPruebaDos));
        Assertions.assertEquals("los apellidos ingresados no cumplen con los requisitos", resultado.getMessage());

    }

    @Test
    public void validarDocumentoCorrecto() {
        String documentoPrueba = "100029177";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarDocumentoIncorrectoTipoCaracteres() {
        String documentoprueba = "123454hfd";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDocumento(documentoprueba));
        Assertions.assertEquals("el documento no coincide", resultado.getMessage());
    }

    @Test
    public void ValidarDocumentoIncorrectoLongitud() {
        String documentoPrueba = "123";


        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDocumento(documentoPrueba));
        Assertions.assertEquals("documento con longitud invalida", resultado.getMessage());


    }

    @Test
    public void ValidarDocumentoIncorrectoLargo() {
        String documentoPruebaDos = "12345678900987654323456789098765432123456789876543234567898765432345678987654334567";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDocumento(documentoPruebaDos));
        Assertions.assertEquals("documento con longitud invalida", resultado.getMessage());

    }

    @Test
    public void validarCiudadCorrecto() {
        String ciudadPrueba = "342";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarCiudad(ciudadPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarCiudadIncorrectoTipoCaracteres() {
        String ciudadprueba = "34grf";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarCiudad(ciudadprueba));
        Assertions.assertEquals("la ciudad no coincide", resultado.getMessage());
    }

    @Test
    public void ValidarCiudadIncorrectoLongitud() {
        String ciudadPrueba = "123440987654345678909876543456789";


        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarCiudad(ciudadPrueba));
        Assertions.assertEquals("la ciudad ingresada  es invalida", resultado.getMessage());


    }

    @Test
    public void validarDepartamentoCorrecto() {
        String departamentoPrueba = "30543645526252673241";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionAfiliado.validarDepartamento(departamentoPrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void validarDepartamentoIncorrectoTipoCaracteres() {
        String departamentoprueba = "medellin1234";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDepartamento(departamentoprueba));
        Assertions.assertEquals("el departamento no coincide", resultado.getMessage());
    }

    @Test
    public void ValidarDepartamentoIncorrectoLongitud() {
        String documentoPrueba = "123";


        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDepartamento(documentoPrueba));
        Assertions.assertEquals("el departamento ingresado es invalido", resultado.getMessage());


    }

    @Test
    public void ValidarDepartamentoIncorrectoLargo() {
        String departamentoPruebaDos = "12345678900987654323456789098765432123456789876543234567898765432345678987654334567";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionAfiliado.validarDepartamento(departamentoPruebaDos));
        Assertions.assertEquals("el departamento ingresado es invalido", resultado.getMessage());

    }
    @Test
    public void validarCorreoElectronicoCorrecto(){
        String electronicoPrueba ="sebastianb.0211@gmail.com";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionAfiliado.validarCorreoElectronico(electronicoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarCorreoElectronicoIncorrectoTipoCaracteres(){
        String electronicoprueba ="sebastian";
        Exception resultado =Assertions.assertThrows(Exception.class,()->this.validacionAfiliado.validarCorreoElectronico(electronicoprueba));
        Assertions.assertEquals("el formato de correo electronico  no coincide",resultado.getMessage());
    }



    }