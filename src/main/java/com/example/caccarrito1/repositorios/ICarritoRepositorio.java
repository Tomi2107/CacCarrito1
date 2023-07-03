package com.example.caccarrito1.repositorios;

import com.example.caccarrito1.entidades.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarritoRepositorio extends JpaRepository<Carrito, Long> {
}
