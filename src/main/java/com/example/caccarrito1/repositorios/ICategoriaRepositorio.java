package com.example.caccarrito1.repositorios;

import com.example.caccarrito1.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepositorio extends JpaRepository<Categoria, Long> {
}
