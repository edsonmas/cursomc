package com.edsonMatheus.cursomc.dto;

import com.edsonMatheus.cursomc.domain.Produto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String nome;
    private double preço;

    public ProdutoDTO() {
    }
    public ProdutoDTO(Produto obj) {
        id = obj.getId();
        nome = obj.getNome();
        preço = obj.getPreco();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
