package org.example.entidades;

import org.example.validaciones.ValidacionAfiliado;

import java.time.LocalDate;

public class    Afiliado {


    private Integer id;
    private String documento;

    private String nombres;

    private  String apellidos;

    private  LocalDate fechaNacimiento;

    private  Integer ciudad;

    private  Integer departamento;

    private  String correoElectronico;

    private String telefono;

    private ValidacionAfiliado validacionAfiliado=new ValidacionAfiliado(); // inyectar dependencias

    public Afiliado() {
    }

    public Afiliado(Integer id, String documento, String nombres, String apellidos, LocalDate fechaNacimiento, Integer ciudad, Integer departamento, String correoElectronico, String telefono) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try {// intentento si no fui capaz capturo el por que
            this.validacionAfiliado.validarId(id);
            this.id=id;
            System.out.println("id cargado con exito");

        }catch (Exception error){
            System.out.println(error.getMessage());
        }


    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {

        try {
            this.validacionAfiliado.validarDocumento(documento);
            this.documento=documento;
            System.out.println("id cargado con exito");
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {

        try {
            this.validacionAfiliado.validarNombre(nombres);
            this.nombres=nombres;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {

        try {
            this.validacionAfiliado.validarApellido(apellidos);
            this.apellidos=apellidos;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        try {
            this.validacionAfiliado.validarCiudad(ciudad.toString());
            this.ciudad=ciudad;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }


    }

    public Integer getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {

        try {
            this.validacionAfiliado.validarDepartamento(departamento.toString());
            this.departamento=departamento;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }


    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {

        try {
            this.validacionAfiliado.validarCorreoElectronico(correoElectronico);
            this.correoElectronico=correoElectronico;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {

        try {
            this.validacionAfiliado.validarTelefono(telefono);
            this.telefono=telefono;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
