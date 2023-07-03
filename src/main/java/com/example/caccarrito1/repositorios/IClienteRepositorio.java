package com.example.caccarrito1.repositorios;

import com.example.caccarrito1.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepositorio extends JpaRepository<Cliente, Long> {
}
