package com.example.caccarrito1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarritoDto {
    private Long id;
    private LocalDate fecha;
    private ClienteDto cliente;
    private List<PedidoDtoCarrito> pedidos;
    private Double precioTotal;
}
