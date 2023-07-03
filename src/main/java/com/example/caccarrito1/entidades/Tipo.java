package com.example.caccarrito1.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tipos")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @Column(name="NOMBRE", nullable = false, length = 30, unique = true)
    private String nombre;

    public Tipo(String nombre) {
        this.nombre = nombre;
    }
}
