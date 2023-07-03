package com.example.caccarrito1.repositorios;

import com.example.caccarrito1.entidades.Carrito;
import com.example.caccarrito1.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPedidoRepositorio extends JpaRepository<Pedido, Long> {
    List<Pedido> findAllByCarrito(Carrito carrito);
}
