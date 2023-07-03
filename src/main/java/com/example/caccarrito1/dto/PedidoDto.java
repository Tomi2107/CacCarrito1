package com.example.caccarrito1.dto;

import com.example.caccarrito1.entidades.Carrito;
import com.example.caccarrito1.entidades.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {
    private Long id;
    private Integer cantidad;
    private Carrito carrito;
    private Producto producto;
}
