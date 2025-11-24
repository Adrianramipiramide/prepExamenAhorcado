package com.example.ahorcado.RestController;

import com.example.ahorcado.DAOs.DAOFactory;
import com.example.ahorcado.Entidades.Usuario;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {

    @PutMapping("/api/insertUser")
    void insertarUsuario(@RequestBody Usuario usuario){
        System.out.println(usuario);
        DAOFactory.getInstance().getDaoUsuario().crearUsuario(usuario);

    }

}
