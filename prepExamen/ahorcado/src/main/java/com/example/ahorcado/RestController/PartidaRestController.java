package com.example.ahorcado.RestController;

import com.example.ahorcado.DAOs.DAOFactory;
import com.example.ahorcado.Entidades.Partida;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PartidaRestController {

    @GetMapping("/api/mostrarPartidas")
    List<Partida> mostrarPartidas(){
        List<Partida> listaP = new ArrayList<>();

        for (int i = 0; i < DAOFactory.getInstance().getDaoPartida().mostrarPartidas().size(); i++) {
            listaP.add(DAOFactory.getInstance().getDaoPartida().mostrarPartidas().get(i));
        }
        return listaP;
    }

    @PutMapping("/api/nuevaPartida")
    Partida nuevaPartida(@RequestBody Partida p){
        DAOFactory.getInstance().getDaoPartida().nuevaPartida(p);
        return p;
    }

    @PutMapping("/api/actualizarPartida/{numFallos}")
    Partida actualizarpartida(@PathVariable(name="numFallos") int numFallos,@RequestBody Partida p){

      return  DAOFactory.getInstance().getDaoPartida().actualizarPartida(p,numFallos,p.getGanada());
    }

}
