package com.edsonMatheus.cursomc.services;

import com.edsonMatheus.cursomc.domain.Categoria;
import com.edsonMatheus.cursomc.domain.Cliente;
import com.edsonMatheus.cursomc.repositories.CategoriaRepository;
import com.edsonMatheus.cursomc.repositories.ClienteRepository;
import com.edsonMatheus.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}


