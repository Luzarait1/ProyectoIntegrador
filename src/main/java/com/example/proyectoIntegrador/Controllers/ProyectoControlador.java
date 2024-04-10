package com.example.proyectoIntegrador.Controllers;

import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Models.Tarea;
import com.example.proyectoIntegrador.Service.ProyectoGestion;
import com.example.proyectoIntegrador.Service.TareaGestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProyectoControlador {

    private ProyectoGestion proyectoGestion;
    private TareaGestion tareaGestion;

    @Autowired
    public ProyectoControlador(ProyectoGestion proyectoGestion, TareaGestion tareaGestion) {
        this.proyectoGestion = proyectoGestion;
        this.tareaGestion = tareaGestion;
    }

    //Crear un proyecto nuevo
    @PostMapping("/proyectos/")
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
        return this.proyectoGestion.crearProyecto(proyecto);
    }

    //Editar un proyecto existente
    @PutMapping("/proyectos/{identificacion}")
    public Proyecto editarProyecto(@PathVariable("identificacion") long identificacion, @RequestBody Proyecto proyecto) {
        return this.proyectoGestion.editarProyecto(identificacion, proyecto);
    }

    //Eliminar un proyecto
    @DeleteMapping("/proyectos/{identificacion}")
    public void eliminarProyecto(@PathVariable("identificacion") long identificacion) {
        this.proyectoGestion.eliminarProyecto(identificacion);
    }

    //Obtener un proyecto por identificacion
    @GetMapping("/proyectos/{identificacion}")
    public Proyecto obtenerProyectoPorId(@PathVariable("identificacion") long identificacion) {
        return this.proyectoGestion.obtenerProyectoPorId(identificacion);
    }

    //Controladores para Tarea
    @GetMapping("/tareas/{idTarea}")
    public Tarea obtenerTarea(@PathVariable("idTarea") long idTarea) {
        return this.tareaGestion.obtenerTarea(idTarea);
    }

    @DeleteMapping("/tareas/{idTarea}")
    public void eliminarTarea(@PathVariable("idTarea") long idTarea) {
        this.tareaGestion.eliminarTarea(idTarea);
    }
}
