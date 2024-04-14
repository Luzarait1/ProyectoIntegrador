package com.example.proyectoIntegrador;

import com.example.proyectoIntegrador.Repository.ProyectoJpaRepository;
import com.example.proyectoIntegrador.Repository.TareaJpaRepository;
import com.example.proyectoIntegrador.Service.ProyectoService;
import com.example.proyectoIntegrador.Service.TareaService;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;

public class ProyectoServiceTest {

    //@BeforeEach: Para instanciar la clase que quiero testear y preparo. es como el constructo
    /*
    1. Debo mirar las dependencias de la clase (la repository del service)
    2. mirar cuales son los mocks? las de reposiitory porque son la conexion a la base
    de datos que se van a simular. simular comportamiento de la base de datos
    3. hacer el BeforeEach
     */

    private ProyectoService proyectoService;
    private ProyectoJpaRepository proyectoJpaRepository;

    @BeforeEach
    public void construir() {
        proyectoJpaRepository = mock(ProyectoJpaRepository.class);
        this.proyectoService = new ProyectoService(proyectoJpaRepository);
    }



}
