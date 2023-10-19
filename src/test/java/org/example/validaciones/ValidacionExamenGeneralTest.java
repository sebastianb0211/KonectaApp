package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidacionExamenGeneralTest {

    ValidacionExamenGeneral validacionExamenGeneral;

    @BeforeEach
    public void prepararPruebas()
    {
        this.validacionExamenGeneral = new ValidacionExamenGeneral();
    }

    @Test
    public void validarIdCorrecto()
    {
        //1. preparar
        Integer idPrueba = 8;
        //2. ejecutar
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionExamenGeneral.validarId(idPrueba));
        //3. verificar
        Assertions.assertTrue(resultado);
    }
        @Test
        public void validarIdIncorrecto()
        {
            //1.Preparar
            Integer idPrueba = -8;
            //2.Ejecutar
            Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarId(idPrueba));
            //3.Verificar
            Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensaje(), resultado.getMessage());
        }
        @Test
        public void validarNombreExamenCorrecto()
        {
            String nombrePrueba = "Examen General";
            Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionExamenGeneral.validarNombreExamen(nombrePrueba));
            Assertions.assertTrue(resultado);
        }
        @Test
    public void validarNombreExamenCarracteresIncorrectos()
        {
            String nombrePrueba = "Examevl123";
            Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarNombreExamen(nombrePrueba));
            Assertions.assertEquals("el nombre del examen esta mal redactado", resultado.getMessage());
        }
    @Test
    public void validarNombreExamenLongitudMin()
    {
        String nombrePrueba = "Ex";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarNombreExamen(nombrePrueba));
        Assertions.assertEquals(" Error en el nombre del examen no coincide en el sistema", resultado.getMessage());
    }
    @Test
    public void validarNombreExamenLongitudMax()
    {
        String nombrePrueba = "Examengerallalalallalallalalallalaallalalllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllalwalllaslldlakdhgfhhhhhhhhhhhhgfhtttttttttttttttttttttfhhhhhhhhhhfhfhfhfthfhdhdhgyulioñhjkhkhjkiloññululiluiluñuñululuiluiluiluñuñu";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarNombreExamen(nombrePrueba));
        Assertions.assertEquals(" Error en el nombre del examen no coincide en el sistema", resultado.getMessage());
    }
    @Test
    public void validarImagenExamenCorrecto()
    {
        String imagenPrueba = "imagen como ejemplo para el test";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionExamenGeneral.validarImagenExamen(imagenPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarImagenExamenCaracteresMin()
    {
        
        String imagenPrueba = "";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarImagenExamen(imagenPrueba));
        Assertions.assertEquals("la imagen supera o no cumple los requerimientos necesarios", resultado.getMessage());
    }
    @Test
    public void validarImagenExamenCaracteresMax()
    {
        String imagenPrueba = "Imagenllalalallalallalalallalaallalalllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllalwalllaslldlakdhgfhhhhhhhhhhhhgfhtttttttttttttttttttttfhhhhhhhhhhfhfhfhfthfhdhdhgyulioñhjkhkhjkiloññululiluiluñuñululuiluiluiluñuñu";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionExamenGeneral.validarImagenExamen(imagenPrueba));
        Assertions.assertEquals("la imagen supera o no cumple los requerimientos necesarios", resultado.getMessage());
    }


    }


