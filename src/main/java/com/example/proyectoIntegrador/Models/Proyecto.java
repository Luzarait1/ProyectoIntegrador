package com.example.proyectoIntegrador.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "proyecto")

public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private List<Tarea> listaTareas = new ArrayList<>();

    public Proyecto(long idProyecto, String nombre, String descripcion, ProjectStatus status, LocalDateTime createdDate, LocalDateTime lastUpdatedTime, List<Tarea> listaTareas) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.status = status;
        this.createdDate = createdDate;
        this.lastUpdatedTime = lastUpdatedTime;
        this.listaTareas = listaTareas;
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

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
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
