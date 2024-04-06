package com.github.vinicius015.mvc_rh.model;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department extends AbstractEntity<Long> {

    @Column(nullable = false, length = 60, unique = true)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
