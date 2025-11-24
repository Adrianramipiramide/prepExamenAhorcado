package com.example.ahorcado.DAOs.Partida;

import com.example.ahorcado.Entidades.Partida;

import java.util.List;

public interface DAOPartida {
    List<Partida> mostrarPartidas ();

    void nuevaPartida (Partida p);

    Partida actualizarPartida (Partida p, Integer numFallos, Boolean ganada);
}
