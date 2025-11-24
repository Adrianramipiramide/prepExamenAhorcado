package com.example.ahorcado.Controllers;

import com.example.ahorcado.DAOs.DAOFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PartidaController {

    @RequestMapping("/")
    String paginaPrincipal(Model model){
        model.addAttribute("partidas", DAOFactory.getInstance().getDaoPartida().mostrarPartidas());
        System.out.println(DAOFactory.getInstance().getDaoPartida().mostrarPartidas());
        return "/index.html";
    }
}
