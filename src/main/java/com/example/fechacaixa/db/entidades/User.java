package com.example.fechacaixa.db.entidades;

public class User {
    private String usuario;
    private String senha;
    private String cpf;

    public User(String usuario, String senha, String cpf) {
        this.usuario = usuario;
        this.senha = senha;
        this.cpf = cpf;
    }

    public User() {
        this("", "", "");
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
