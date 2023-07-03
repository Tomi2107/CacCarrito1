package com.example.caccarrito1.dto;

import com.example.caccarrito1.entidades.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDtoCarrito {
    private Long id;
    private Integer cantidad;
    private Producto producto;

    public Double subTotal(){
        return this.cantidad * this.producto.getPrecio();
    }
}
