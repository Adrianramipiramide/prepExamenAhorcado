package com.example.ahorcado.DAOs.Palabra;

import com.example.ahorcado.DAOs.BDConnector;
import com.example.ahorcado.Entidades.Partida;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class DAOPalabraSQL implements DAOPalabra{
    @Override
    public Boolean comprobarLetra(String letra,String palabra) {
        String consulta = "select palabra from Palabra where palabra = ? AND palabra LIKE ?";

        try{
            PreparedStatement statement = BDConnector.getInstance().prepareStatement(consulta);
            statement.setString(1,palabra);
            statement.setString(2,'%'+letra+'%');
            ResultSet rs = statement.executeQuery();
            while (rs.next()){

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }




        return null;
    }

    @Override
    public Boolean comprobarPalabra(String letra) {
        return null;
    }
}
