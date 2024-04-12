package com.example.proyectoIntegrador.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Proyecto")

public class Proyecto {

    @Id
    @GeneratedValue()
    private long idProyecto;

    @Column (name = "nombre", nullable = false)
    private String nombre;

    @Column (name = "descripcion", nullable = false)
    private String descripcion;

    @Column (name = "status", nullable = false)
    private ProjectStatus status;

    @Column (name = "createdDate", nullable = false)
    private LocalDateTime createdDate;

    @Column (name = "lastUpdatedTime", nullable = false)
    private LocalDateTime lastUpdatedTime;

    public Proyecto(long idProyecto, String nombre, String descripcion, ProjectStatus status, LocalDateTime createdDate, LocalDateTime lastUpdatedTime) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.status = status;
        this.createdDate = createdDate;
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Proyecto() {

    }

    public long getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(long idProyecto) {
        this.idProyecto = idProyecto;
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

    public LocalDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "idProyecto=" + idProyecto +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", status=" + status +
                ", createdDate=" + createdDate +
                ", lastUpdatedTime=" + lastUpdatedTime +
                '}';
    }
}
