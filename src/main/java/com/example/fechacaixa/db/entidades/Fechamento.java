package com.example.fechacaixa.db.entidades;

import java.time.LocalDate;

public class Fechamento {
    private int id;
    private double pix;
    private double dinheiro;
    private double cartao;
    private double saida;
    private LocalDate data;
    private User usuario;

    public Fechamento(int id, double pix, double dinheiro, double cartao, double saida, LocalDate data, User usuario) {
        this.id = id;
        this.pix = pix;
        this.dinheiro = dinheiro;
        this.cartao = cartao;
        this.saida = saida;
        this.data = data;
        this.usuario = usuario;
    }

    public Fechamento() {
        this(0, 0, 0, 0, 0, LocalDate.now(), null);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPix() {
        return pix;
    }

    public void setPix(double pix) {
        this.pix = pix;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getCartao() {
        return cartao;
    }

    public void setCartao(double cartao) {
        this.cartao = cartao;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
