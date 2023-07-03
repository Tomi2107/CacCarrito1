package com.example.caccarrito1.repositorios;

import com.example.caccarrito1.entidades.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMarcaRepositorio extends JpaRepository<Marca, Long> {
}
