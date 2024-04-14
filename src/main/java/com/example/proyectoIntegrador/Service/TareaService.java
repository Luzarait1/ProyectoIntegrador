package com.example.proyectoIntegrador.Service;

import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Models.Tarea;
import com.example.proyectoIntegrador.Repository.TareaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    private TareaJpaRepository tareaJpaRepository;
    @Autowired
    public TareaService(TareaJpaRepository tareaJpaRepository) {
        this.tareaJpaRepository = tareaJpaRepository;
    }

    //public List<Tarea> tareas = new ArrayList<>();


    public Tarea obtenerTarea(long idTarea) {
        Optional<Tarea> tareaEncontrada = tareaJpaRepository.findById(idTarea);
        if (tareaEncontrada.isPresent()) {
            System.out.println("La tarea se ha encontrado");
            return tareaEncontrada.get();
        } else {
            System.out.println("El tarea no se encontro ");
        }
        return null;
    }

    public void eliminarTarea(long idTarea) {
        tareaJpaRepository.deleteById(idTarea);
        System.out.println("La tarea con id " + idTarea + " ha sido eliminada correctamente");
    }

}

/*
    public void eliminarTarea(long idTarea) {
        Tarea tarea = obtenerTarea(idTarea);
        this.tareas.remove(tarea);
        System.out.println("La tarea fue eliminada correctamente");
    }

    public Tarea obtenerTarea(long idTarea) {
        return this.tareas.stream()
                .filter(tarea -> tarea.getIdTarea() == idTarea)
                .findFirst().get();
    }
 */
