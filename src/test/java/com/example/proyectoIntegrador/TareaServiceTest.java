package com.example.proyectoIntegrador;

import com.example.proyectoIntegrador.Repository.TareaJpaRepository;
import com.example.proyectoIntegrador.Service.TareaService;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.mock;

public class TareaServiceTest {

    //@BeforeEach: Para instanciar la clase que quiero testear y preparo. es como el constructo
    /*
    1. Debo mirar las dependencias de la clase (la repository del service)
    2. mirar cuales son los mocks? las de reposiitory porque son la conexion a la base
    de datos que se van a simular. simular comportamiento de la base de datos
    3. hacer el BeforeEach
     */

    private TareaService tareaService;
    private TareaJpaRepository tareaJpaRepository;

    @BeforeEach
    public void construir() {
        tareaJpaRepository = mock(TareaJpaRepository.class);
        this.tareaService = new TareaService(tareaJpaRepository);
    }


}
