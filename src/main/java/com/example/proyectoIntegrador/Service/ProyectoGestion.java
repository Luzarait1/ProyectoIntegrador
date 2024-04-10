package com.example.proyectoIntegrador.Service;

import com.example.proyectoIntegrador.Models.Proyecto;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProyectoGestion {

    List<Proyecto> proyectos = new ArrayList<>();

    public Proyecto crearProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
        System.out.println("El proyecto se creo exitosamente");
        return proyecto;
    }

    public Proyecto editarProyecto(long idProyecto, Proyecto proyecto) {
        Optional<Proyecto> proyectoExiste = proyectos.stream()
                .filter(p -> p.getIdProyecto() == idProyecto)
                .findFirst();

        if (proyectoExiste.isPresent()) {
            // repositorio.save
            proyectoExiste.get().setDescripcion(proyecto.getDescripcion());
            proyectoExiste.get().setNombre(proyecto.getNombre());
            proyectoExiste.get().setStatus(proyecto.getStatus());
            proyectoExiste.get().setLastUpdatedTime(proyecto.getLastUpdatedTime());

            System.out.println(proyecto.toString());
        }
        return proyecto;
    }

    public void eliminarProyecto(long idProyecto) {
        Proyecto proyecto = obtenerProyectoPorId(idProyecto);
        this.proyectos.remove(proyecto);
        System.out.println("El proyecto fue eliminado correctamente");
    }

    public Proyecto obtenerProyectoPorId(long idProyecto) {
        return this.proyectos.stream()
                .filter(proyecto -> proyecto.getIdProyecto() == idProyecto)
                .findFirst().get();
    }
}
