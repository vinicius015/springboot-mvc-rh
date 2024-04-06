package com.github.vinicius015.mvc_rh.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends AbstractEntity {

    @Column(nullable = false, length = 60, unique = true)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "department_id_fk")
    private Department department;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
