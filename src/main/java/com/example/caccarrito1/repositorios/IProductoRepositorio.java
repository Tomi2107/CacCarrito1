package com.example.caccarrito1.repositorios;

import com.example.caccarrito1.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepositorio extends JpaRepository<Producto, Long> {
}
