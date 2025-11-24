package com.example.ahorcado.Entidades;

public class Palabra {
    Integer id;
    String palabra;

    public Palabra(Integer id, String palabra) {
        this.id = id;
        this.palabra = palabra;
    }
    public Palabra(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
