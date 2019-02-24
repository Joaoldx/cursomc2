package com.joaodomingos.cursomc.Service;

import com.joaodomingos.cursomc.Domain.Categoria;
import com.joaodomingos.cursomc.Repository.CategoriaRepository;
import com.joaodomingos.cursomc.Service.Exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}