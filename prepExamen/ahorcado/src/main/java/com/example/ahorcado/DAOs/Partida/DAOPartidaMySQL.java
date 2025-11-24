package com.example.ahorcado.DAOs.Partida;

import com.example.ahorcado.DAOs.BDConnector;
import com.example.ahorcado.Entidades.Partida;
import tools.jackson.databind.deser.BasicDeserializerFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DAOPartidaMySQL implements DAOPartida{
    @Override
    public List<Partida> mostrarPartidas() {
        List<Partida> listaPartidas = new ArrayList<>();
        String consulta = "select * from Partida";
        try{
            PreparedStatement statement = BDConnector.getInstance().prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                LocalDate fechaHora = rs.getDate("fechaHora").toLocalDate();
                Boolean ganada = rs.getBoolean("ganada");
                int numFallos = rs.getInt("numFallos");
                String nombreUsuario = rs.getString("nombreUsuario");
                int idPalabra = rs.getInt("idPalabra");
                listaPartidas.add(new Partida(id,fechaHora,ganada,numFallos,nombreUsuario,idPalabra));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPartidas;
    }

    @Override
    public void nuevaPartida(Partida p) {

    }

    @Override
    public Partida actualizarPartida(Partida p, Integer numFallos, Boolean ganada) {
        return null;
    }
}
