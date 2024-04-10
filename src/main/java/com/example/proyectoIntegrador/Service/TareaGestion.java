package com.example.proyectoIntegrador.Service;

import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Models.Tarea;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TareaGestion {

    public List<Tarea> tareas = new ArrayList<>();

    public Tarea obtenerTarea(long idTarea) {
        return this.tareas.stream()
                .filter(tarea -> tarea.getIdTarea() == idTarea)
                .findFirst().get();
    }

    public void eliminarTarea(long idTarea) {
        Tarea tarea = obtenerTarea(idTarea);
        this.tareas.remove(tarea);
        System.out.println("La tarea fue eliminada correctamente");
    }


}
