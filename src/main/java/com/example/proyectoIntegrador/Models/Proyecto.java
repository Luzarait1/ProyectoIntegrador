package com.example.proyectoIntegrador.Models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Proyecto {

    private UUID uuid;
    private String nombre;
    private String descripcion;
    private ProjectStatus status;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdatedTime;

    public Proyecto(UUID uuid, String nombre, String descripcion, ProjectStatus status, LocalDateTime createdDate, LocalDateTime lastUpdatedTime) {
        this.uuid = uuid;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.status = status;
        this.createdDate = createdDate;
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public void setStatus(ProjectStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
