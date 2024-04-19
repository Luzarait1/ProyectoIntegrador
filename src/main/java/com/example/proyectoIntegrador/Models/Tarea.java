package com.example.proyectoIntegrador.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "tarea")

public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTarea;

    @Column (name = "nombre", nullable = false)
    private String nombre;

    @Column (name = "descripcion", nullable = false)
    private String descripcion;

    @Column (name = "status_t", nullable = false)
    private TaskStatus status_t;

    @Column (name = "type", nullable = false)
    private TaskType type;

    @Column (name = "startDate", nullable = false)
    private LocalDateTime startDate;

    @Column (name = "dueDate", nullable = false)
    private LocalDateTime dueDate;

    @Column (name = "createdDate", nullable = false)
    private LocalDateTime createdDate;

    @Column (name = "lastUpdatedDate", nullable = false)
    private LocalDateTime lastUpdatedDate;

    @ManyToOne()
    @JoinColumn(name = "idProyecto", nullable = false)
    private Proyecto proyecto;

    public Tarea(long idTarea, String nombre, String descripcion, TaskStatus status_t, TaskType type, LocalDateTime startDate, LocalDateTime dueDate, LocalDateTime createdDate, LocalDateTime lastUpdatedDate, Proyecto proyecto) {
        this.idTarea = idTarea;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.status_t = status_t;
        this.type = type;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.proyecto = proyecto;
    }

    public long getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(long idTarea) {
        this.idTarea = idTarea;
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

    public LocalDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
