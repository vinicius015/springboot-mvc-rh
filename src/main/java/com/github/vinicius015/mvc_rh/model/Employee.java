package com.github.vinicius015.mvc_rh.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal salary;

    @Column(nullable = false)
    private Role role;

    @Column(nullable = false)
    private Address address;
}
