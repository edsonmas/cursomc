package com.edsonMatheus.cursomc.services;

import com.edsonMatheus.cursomc.domain.Categoria;
import com.edsonMatheus.cursomc.domain.Pedido;
import com.edsonMatheus.cursomc.repositories.PedidoRepository;
import com.edsonMatheus.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

}


