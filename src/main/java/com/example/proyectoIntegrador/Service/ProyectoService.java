package com.example.proyectoIntegrador.Service;

import com.example.proyectoIntegrador.Models.Proyecto;
import com.example.proyectoIntegrador.Repository.ProyectoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProyectoService {


    private ProyectoJpaRepository proyectoJpaRepository;
    @Autowired
    public ProyectoService(ProyectoJpaRepository proyectoJpaRepository) {
        this.proyectoJpaRepository = proyectoJpaRepository;
    }

    //List<Proyecto> proyectos = new ArrayList<>();

    public Proyecto crearProyecto(Proyecto proyecto) {
        proyectoJpaRepository.save(proyecto);
        System.out.println("El proyecto se ha creado exitosamente");
        return proyecto;
    }

    public Proyecto editarProyecto(long idProyecto, Proyecto proyecto) {
        Optional<Proyecto> proyectoExiste = proyectoJpaRepository.findById(idProyecto);

        if(proyectoExiste.isPresent()) {
            proyectoJpaRepository.save(proyecto);
            System.out.println("El proyecto con id " + idProyecto + " se edito correctamente");
        } else {
            System.out.println("El proyecto con id " + idProyecto + " no se logro editar");
        }
        return proyecto;
    }

    public void eliminarProyecto(long idProyecto) {
        proyectoJpaRepository.deleteById(idProyecto);
        System.out.println("El proyecto con id " + idProyecto + " ha sido eliminado correctamente");
    }

    public Proyecto obtenerProyectoPorId(long idProyecto) {
        Optional<Proyecto> proyectoEncontrado = proyectoJpaRepository.findById(idProyecto);
        if (proyectoEncontrado.isPresent()) {
            System.out.println("El proyecto con id " + idProyecto + " se ha encontrado");
            return proyectoEncontrado.get();
        } else {
            System.out.println("El proyecto con id " + idProyecto + " no se encontro ");
        }
        return null;
    }

}

/*
    public Proyecto createProject(Proyecto proyecto) {

        if(proyecto.getIdProyecto() <= 0) {
            System.out.println("El ID del proyecto no puede ser negativo o cero");
        }

        if(proyecto.getNombre() == null) {
            System.out.println("El nombre del proyecto no puede ser nulo");
        }

        if(proyecto.getCreatedDate() == null) {
            System.out.println("La fecha de creacion del proyecto no puede ser nula");
        }
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


    public Proyecto obtenerProyectoPorId(long idProyecto) {
        return this.proyectos.stream()
                .filter(proyecto -> proyecto.getIdProyecto() == idProyecto)
                .findFirst().get();
    }


    public void eliminarProyecto(long idProyecto) {
        Proyecto proyecto = obtenerProyectoPorId(idProyecto);
        this.proyectos.remove(proyecto);
        System.out.println("El proyecto fue eliminado correctamente");
    }
 */
