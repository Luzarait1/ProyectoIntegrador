package com.example.proyectoIntegrador.Models;

public class Usuario {
    private int id;
    private String username;
    private String clave;

    public Usuario(int id, String username, String clave) {
        this.id = id;
        this.username = username;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}


