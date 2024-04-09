package com.example.proyectoIntegrador.Models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Tarea {

    private UUID uuid_tarea;
    private String nombre;
    private String descripcion;
    private TaskStatus status_t;
    private TaskType type;
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdatedDate;

    public Tarea(UUID uuid_tarea, String nombre, String descripcion, TaskStatus status_t, TaskType type, LocalDateTime startDate, LocalDateTime dueDate, LocalDateTime createdDate, LocalDateTime lastUpdatedDate) {
        this.uuid_tarea = uuid_tarea;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.status_t = status_t;
        this.type = type;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public UUID getUuid_tarea() {
        return uuid_tarea;
    }

    public void setUuid_tarea(UUID uuid_tarea) {
        this.uuid_tarea = uuid_tarea;
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

    public TaskStatus getStatus_t() {
        return status_t;
    }

    public void setStatus_t(TaskStatus status_t) {
        this.status_t = status_t;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
