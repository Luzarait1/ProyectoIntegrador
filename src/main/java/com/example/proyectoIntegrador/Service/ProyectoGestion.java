package com.example.proyectoIntegrador.Service;

import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Models.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProyectoGestion {

    List<Proyecto> proyectos = new ArrayList<>();

    public String crearProyecto(Usuario usuario, Proyecto proyecto) {
        proyectos.add(proyecto);
        return "El usuario" + usuario + "ha creado un nuevo proyecto con id" + proyecto.getIdProyecto();
    }

    public String editarProyecto(long idProyecto, Proyecto proyecto) {

        for (Proyecto proyecto1: proyectos) {
            long id = proyecto.getIdProyecto();
            if (id == idProyecto) {
                return "El proyecto existe y se puede editar";
            }
        }
        return "Error: El proyecto no existe, no se puede editar";
    }

    public String borrarProyecto(long idProyecto) {

        for (Proyecto proyecto: proyectos) {
            long id = proyecto.getIdProyecto();
            if (id == idProyecto) {
                proyectos.remove(proyecto);
                return "El proyecto fue eliminado exitosamente";
            }
        }
        return "El proyecto no existe";
    }

    public String obtenerProyectoPorId(long idProyecto ) {
        for (Proyecto proyecto : proyectos) {
            long id = proyecto.getIdProyecto();
            if (id == idProyecto) {
                return "El proyecto fue encontrado" + proyecto.toString();
            }
        }
        return "El proyecto no fue encontrado o no existe";
    }
}
