package com.example.proyectoIntegrador.DTO;

import com.example.proyectoIntegrador.Models.ProjectStatus;

import java.time.LocalDateTime;

public class ProyectoDto {

    private String nombre;
    private String descripcion;

    public ProyectoDto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
