package org.example.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Examenesgenerales {


    private Integer id;

    private String nombreExamen;

    private LocalDateTime fechaExamen;

    private String imagenExamen;

    public Examenesgenerales() {
    }

    public Examenesgenerales(Integer id, String nombreExamen, LocalDateTime fechaExamen, String imagenExamen) {
        this.id = id;
        this.nombreExamen = nombreExamen;
        this.fechaExamen = fechaExamen;
        this.imagenExamen = imagenExamen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public LocalDateTime getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDateTime fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public String getImagenExamen() {
        return imagenExamen;
    }

    public void setImagenExamen(String imagenExamen) {
        this.imagenExamen = imagenExamen;
    }
}
