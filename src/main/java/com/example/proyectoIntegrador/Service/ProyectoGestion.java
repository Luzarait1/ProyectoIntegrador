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

    public String editarProyecto(long idProyecto, Proyecto proyecto) {
        Optional<Proyecto> proyectoExiste = proyectos.stream()
                .filter(p -> p.getIdProyecto() == idProyecto)
                .findFirst();

        if (proyectoExiste.isPresent()) {
            Proyecto encontrado = proyectoExiste.get();
            System.out.println("El proyecto que se va a modificar es: " + encontrado);
            return "El proyecto fue editado correctamente";
        }
        return "El proyecto no existe";
    }

    public String borrarProyecto(long idProyecto) {
        Optional<Proyecto> proyectoExiste = proyectos.stream()
                .filter(p -> p.getIdProyecto() == idProyecto)
                .findFirst();

        if (proyectoExiste.isPresent()) {
            proyectos.remove(proyectoExiste);
            return "El proyecto fue borrado exitosamente";
        }
        return "El proyecto no existe";
    }

    public void eliminarProyecto(long idProyecto) {
        Proyecto proyecto = obtenerProyectoPorId(idProyecto);
        this.proyectos.remove(proyecto);
    }

    public Proyecto obtenerProyectoPorId(long idProyecto ) {
        return this.proyectos.stream()
                .filter(proyecto -> proyecto.getIdProyecto() == idProyecto)
                .findFirst().get();
    }


}
