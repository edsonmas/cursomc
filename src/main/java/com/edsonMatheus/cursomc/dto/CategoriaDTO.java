package com.edsonMatheus.cursomc.dto;

import com.edsonMatheus.cursomc.domain.Categoria;
import com.edsonMatheus.cursomc.services.validation.ClienteUpdate;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@ClienteUpdate
public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    @NotEmpty(message = "Preenchimento Obrigatório")
    @Length(min = 5, max = 40,message = "O tamanho é entre 5 e 40 caracteres")
    private String nome;

    public CategoriaDTO() {
    }
    public CategoriaDTO(Categoria obj) {
        id = obj.getId();
        nome = obj.getNome();
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
}
