package com.example.ahorcado.Entidades;

import java.time.LocalDate;

public class Partida {

    Integer id;
    LocalDate fechaHora;
    Boolean ganada;
    Integer numFallos;
    String nombreUsuario;
    Integer idPalabra;


    public Partida(Integer id, LocalDate fechaHora, Boolean ganada, Integer numFallos, String nombreUsuario, Integer idPalabra) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.ganada = ganada;
        this.numFallos = numFallos;
        this.nombreUsuario = nombreUsuario;
        this.idPalabra = idPalabra;
    }

    public Partida(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Boolean getGanada() {
        return ganada;
    }

    public void setGanada(Boolean ganada) {
        this.ganada = ganada;
    }

    public Integer getNumFallos() {
        return numFallos;
    }

    public void setNumFallos(Integer numFallos) {
        this.numFallos = numFallos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Integer getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(Integer idPalabra) {
        this.idPalabra = idPalabra;
    }
}
