package com.valentino.homebanking.project.dtos;

import com.valentino.homebanking.project.model.Client;

import javax.persistence.Column;

public class ClientDTO {

    private Long id;

    private String usuario;

    private String email;

    private String nombre;

    private String apellido;

    public ClientDTO() {

    }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.usuario = client.getUsuario();
        this.email = client.getEmail();
        this.nombre = client.getNombre();
        this.apellido = client.getApellido();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
