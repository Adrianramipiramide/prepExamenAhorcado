package com.example.ahorcado.DAOs;

import com.example.ahorcado.DAOs.Palabra.DAOPalabra;
import com.example.ahorcado.DAOs.Palabra.DAOPalabraSQL;
import com.example.ahorcado.DAOs.Partida.DAOPartida;
import com.example.ahorcado.DAOs.Partida.DAOPartidaMySQL;
import com.example.ahorcado.DAOs.Usuario.DAOUsuario;
import com.example.ahorcado.DAOs.Usuario.DAOUsuarioMySQL;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOPartida daoPartida;
    private DAOUsuario daoUsuario;
    private DAOPalabra daoPalabra;



    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public DAOPartida getDaoPartida(){
        if (this.daoPartida == null){
            daoPartida = new DAOPartidaMySQL();
        }
        return daoPartida;
    }

    public DAOUsuario getDaoUsuario() {
        if (this.daoUsuario == null) {
            this.daoUsuario = new DAOUsuarioMySQL();
        }
        return daoUsuario;
    }

    public DAOPalabra getDaoPalabra() {
        if (this.daoPalabra == null) {
            this.daoPalabra = new DAOPalabraSQL();
        }
        return daoPalabra;
    }
}
