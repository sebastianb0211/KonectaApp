package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidacionSignoVitalTest {
 ValidacionSignoVital validacionSignoVital;
    @BeforeEach
public void prepararPrueba()
{
    this.validacionSignoVital = new ValidacionSignoVital();
}
    @Test
    public void validarIdCorrecto()
    {
        Integer idPrueba = 8;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarIdIncorrecto()
    {
        Integer idPrueba = -8;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensaje(), resultado.getMessage());
    }
    @Test
    public void validarNombreSignoVitalCorrecto()
    {
        String nombrePrueba = "Pulso";
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.validarNombre(nombrePrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarNombreSignoVitalIncorrectos()
    {
        String nombrePrueba = "Pulso123";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarNombre(nombrePrueba));
        Assertions.assertEquals("el nombre del signo vital no es valido", resultado.getMessage());
    }
    @Test
    public void validarUnidadCorrecta()
    {
        Integer idPrueba = 8;
        Boolean resultado = Assertions.assertDoesNotThrow(() -> this.validacionSignoVital.valiidartUnidadMerdida(idPrueba));
        Assertions.assertTrue(resultado);

    }
    @Test
    public void validarUnidadIncorrecto()
    {
        Integer idPrueba = -8;
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSignoVital.validarId(idPrueba));
        Assertions.assertEquals(Mensajes.ID_NEGATIVO.getMensaje(), resultado.getMessage());
    }

}
