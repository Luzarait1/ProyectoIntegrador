package com.example.proyectoIntegrador.Controllers;

import com.example.proyectoIntegrador.DTO.ProyectoDto;
import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Models.Tarea;
import com.example.proyectoIntegrador.Service.ProyectoService;
import com.example.proyectoIntegrador.Service.TareaService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

import java.net.URI;


@Api(value = "Proyecto", description = "Controlar el proyecto integrador")

@RestController
public class ProyectoControlador {

    private ProyectoService proyectoService;
    private TareaService tareaService;

    @Autowired
    public ProyectoControlador(ProyectoService proyectoService, TareaService tareaService) {
        this.proyectoService = proyectoService;
        this.tareaService = tareaService;
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La solicitud se ha procesado correctamente"),
            @ApiResponse(code = 400, message = "El servidor no ha encontrado el recurso solicitado", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Ha ocurrido un error interno en el sevidor", response = ErrorResponse.class)
    })

    // AT THE END CHANGE THE PROYECTO TO PROYECTODTO
    @ApiOperation(value = "Crear un proyecto nuevo", notes = "Crear un proyecto nuevo en la base de datos con la " +
            "informacion presentada en los parametros", response = Proyecto.class)
    @PostMapping("/proyectos")
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody ProyectoDto proyectoDto) {
        Proyecto proyecto = proyectoService.crearProyecto(proyectoDto);
        return ResponseEntity.created(URI.create("/proyectos" + proyecto.getIdProyecto())).body(proyecto);
    }

    /*
    @PostMapping("/proyectos/")
    public Proyecto crearProyecto(@RequestBody Proyecto proyecto) {
        return this.proyectoService.crearProyecto(proyecto);
    }

     */

    //@PreAuthorize("hasRole('WRITE')")
    @ApiOperation(value = "Editar un proyecto", notes = "Este endpoint permite editar o actualizar la informacion de un proyecto", response = Proyecto.class)

    @PutMapping("/proyectos/{identificacion}")
    public Proyecto editarProyecto(@ApiParam(value = "Se requiere el ID del proyecto a editar", required = true) @PathVariable("identificacion") long identificacion, @RequestBody Proyecto proyecto) {
        return this.proyectoService.editarProyecto(identificacion, proyecto);
    }

    //@PreAuthorize("hasRole('WRITE')")
    @ApiOperation(value = "Eliminar un proyecto", notes = "Este endpoint elimina un proyecto", response = Proyecto.class)

    @DeleteMapping("/proyectos/{identificacion}")
    public void eliminarProyecto(@ApiParam(value = "Se requiere el ID del proyecto a eliminar", required = true) @PathVariable("identificacion") long identificacion) {
        this.proyectoService.eliminarProyecto(identificacion);
    }

    //@PreAuthorize("hasRole('READ')")
    @ApiOperation(value = "Obtener un proyecto por su ID", notes = "Este endpoint permite obtener un proyecto por su numero de "
            + "identificacion especifica", response = Proyecto.class)

    @GetMapping("/proyectos/{identificacion}")
    public Proyecto obtenerProyectoPorId(@ApiParam(value = "Se requiere el ID del proyecto a encontrar", required = true)
                                             @PathVariable("identificacion") long identificacion) {
        return this.proyectoService.obtenerProyectoPorId(identificacion);
    }

    //---------------------------------------------------------------------------------------------------

    //Controladores para Tarea
    @ApiOperation(value = "Obtener un tarea por su ID", notes = "Este endpoint permite obtener una tarea por su numero de identificacion especifica", response = Tarea.class)

    @GetMapping("/tareas/{idTarea}")
    public Tarea obtenerTarea(@ApiParam(value = "Se requiere el ID de la tarea a encontrar", required = true) @PathVariable("idTarea") long idTarea) {
        return this.tareaService.obtenerTarea(idTarea);
    }

    @ApiOperation(value = "Eliminar una tarea", notes = "Este endpoint elimina una tarea", response = Tarea.class)

    @DeleteMapping("/tareas/{idTarea}")
    public void eliminarTarea(@ApiParam(value = "Se requiere el ID de la tarea a eliminar", required = true) @PathVariable("idTarea") long idTarea) {
        this.tareaService.eliminarTarea(idTarea);
    }
}
