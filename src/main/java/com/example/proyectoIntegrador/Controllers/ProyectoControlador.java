package com.example.proyectoIntegrador.Controllers;

import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Models.Tarea;
import com.example.proyectoIntegrador.Service.ProyectoService;
import com.example.proyectoIntegrador.Service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProyectoControlador {

    private ProyectoService proyectoService;
    private TareaService tareaService;

    @Autowired
    public ProyectoControlador(ProyectoService proyectoService, TareaService tareaService) {
        this.proyectoService = proyectoService;
        this.tareaService = tareaService;
    }

    //Crear un proyecto nuevo
    @PostMapping("/proyectos/")
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
        return this.proyectoService.crearProyecto(proyecto);
    }

    //Editar un proyecto existente
    @PutMapping("/proyectos/{identificacion}")
    public Proyecto editarProyecto(@PathVariable("identificacion") long identificacion, @RequestBody Proyecto proyecto) {
        return this.proyectoService.editarProyecto(identificacion, proyecto);
    }

    //Eliminar un proyecto
    @DeleteMapping("/proyectos/{identificacion}")
    public void eliminarProyecto(@PathVariable("identificacion") long identificacion) {
        this.proyectoService.eliminarProyecto(identificacion);
    }

    //Obtener un proyecto por identificacion
    @GetMapping("/proyectos/{identificacion}")
    public Proyecto obtenerProyectoPorId(@PathVariable("identificacion") long identificacion) {
        return this.proyectoService.obtenerProyectoPorId(identificacion);
    }

    //Controladores para Tarea
    @GetMapping("/tareas/{idTarea}")
    public Tarea obtenerTarea(@PathVariable("idTarea") long idTarea) {
        return this.tareaService.obtenerTarea(idTarea);
    }

    @DeleteMapping("/tareas/{idTarea}")
    public void eliminarTarea(@PathVariable("idTarea") long idTarea) {
        this.tareaService.eliminarTarea(idTarea);
    }
}
