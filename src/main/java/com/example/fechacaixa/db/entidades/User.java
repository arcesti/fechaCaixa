package com.example.fechacaixa.db.entidades;

public class User {
    private String usuario;
    private String senha;

    public User(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public User() {
        this("", "");
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
