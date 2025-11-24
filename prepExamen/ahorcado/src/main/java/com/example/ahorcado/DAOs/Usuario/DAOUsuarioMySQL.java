package com.example.ahorcado.DAOs.Usuario;

import com.example.ahorcado.DAOs.BDConnector;
import com.example.ahorcado.Entidades.Usuario;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOUsuarioMySQL implements DAOUsuario{
    @Override
    public void crearUsuario(Usuario u) {
        String consulta = "insert into Usuario (nombre, fechaNacimiento) values (?,?)";
        try{
            PreparedStatement statement = BDConnector.getInstance().prepareStatement(consulta);
            statement.setString(1,u.getNombre());
            statement.setDate(2, Date.valueOf(u.getFechaNacimiento()));
            statement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
