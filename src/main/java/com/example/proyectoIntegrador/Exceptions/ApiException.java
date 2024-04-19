package com.example.proyectoIntegrador.Exceptions;

public class ApiException extends RuntimeException{
    private int codigo;

    public ApiException(String mensaje) {
        super(mensaje);
    }

    public ApiException(int codigo, String mensaje) {
        super(mensaje);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}
