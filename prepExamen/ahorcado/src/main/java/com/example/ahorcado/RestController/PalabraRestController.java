package com.example.ahorcado.RestController;

import com.example.ahorcado.DAOs.DAOFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalabraRestController {
    @GetMapping("/api/comprobarLetra")
    Boolean comporbarLetra(@RequestBody String letra,@RequestBody String palabra){
//no puedo poner 2 reques body?? el postman no los coge
        System.out.println(letra+ palabra);
        return DAOFactory.getInstance().getDaoPalabra().comprobarLetra(letra, palabra);
    }
}
