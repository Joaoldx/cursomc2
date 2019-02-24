package com.joaodomingos.cursomc.Resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaResource {

    @GetMapping
    public String listar(){
        return "Rest está funcionando!";
    }

}
