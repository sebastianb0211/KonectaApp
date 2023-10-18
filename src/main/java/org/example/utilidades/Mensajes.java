package org.example.utilidades;

public enum Mensajes {
    ID_NEGATIVO("Error en el id care chimba porque es negativo"),
    NOMBRES_LONGITUD("El numero de caracteres no es correcto debe estar entre 3 y 40"),
    NOMBRES_FORMATO("el nombre no coincide");
    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
