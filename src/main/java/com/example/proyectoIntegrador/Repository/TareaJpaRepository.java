package com.example.proyectoIntegrador.Repository;

import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaJpaRepository extends JpaRepository<Tarea, Long> {
    Tarea obtenerTarea(long idTarea);
    Tarea eliminarTarea(long idTarea);
}
