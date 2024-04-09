package com.example.proyectoIntegrador.Controllers;

import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Service.ProyectoGestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProyectoControlador {

    private ProyectoGestion proyectoGestion;

    @Autowired
    public ProyectoControlador(ProyectoGestion proyectoGestion) {
        this.proyectoGestion = proyectoGestion;
    }

    //Crear un proyecto nuevo
    @PostMapping("/proyectoGestion/")
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
        return this.proyectoGestion.crearProyecto(proyecto);
    }

    //Editar un proyecto existente
    @PutMapping("/ProyectoGestion/{identificacion}")
    public String editarProyecto(@PathVariable("identificacion") long identificacion, @RequestBody Proyecto proyecto) {
        return this.proyectoGestion.editarProyecto(identificacion, proyecto);
    }

    //Borrar un proyecto
    @DeleteMapping("/ProyectoGestion/{identificacion}")
    public String borrarProyecto(@PathVariable("identificacion") long identificacion) {
        return this.proyectoGestion.borrarProyecto(identificacion);
    }

    @DeleteMapping()
    public void eliminarProyecto(@PathVariable("identificacion") long identificacion) {
        this.proyectoGestion.eliminarProyecto(identificacion);
    }

    //Obtener un proyecto por identificacion
    @GetMapping("/ProyectoGestion/{identificacion}")
    public Proyecto obtenerProyectoPorId(@PathVariable("identificacion") long identificacion) {
        return this.proyectoGestion.obtenerProyectoPorId(identificacion);
    }

}
