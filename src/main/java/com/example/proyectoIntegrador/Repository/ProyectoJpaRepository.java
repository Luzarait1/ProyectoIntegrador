package com.example.proyectoIntegrador.Repository;

import com.example.proyectoIntegrador.Models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoJpaRepository extends JpaRepository<Proyecto, Long> {

    Proyecto crearProyecto(long idProyecto);
    Proyecto eliminarProyeto(long idProyecto);
    Proyecto obtenerProyectoPorId(long idProyecto);
    Proyecto editarProyecto(long idProyecto, Proyecto proyecto);

}
