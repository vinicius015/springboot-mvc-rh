package com.github.vinicius015.mvc_rh.model;

import jakarta.persistence.*;

import java.io.Serializable;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "roles")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(nullable = false, length = 60, unique = true)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "department_id_fk")
    private Department department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
