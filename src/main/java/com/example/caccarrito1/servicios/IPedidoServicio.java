package com.example.caccarrito1.servicios;

import com.example.caccarrito1.dto.PedidoDto;
import com.example.caccarrito1.dto.PedidoDtoCarrito;
import com.example.caccarrito1.dto.RespPedidoDto;
import com.example.caccarrito1.entidades.Carrito;

import java.util.List;

public interface IPedidoServicio {
    public RespPedidoDto agregar(PedidoDto pedidoDto);
    public RespPedidoDto eliminar(Long id);
    public List<PedidoDto> listar();
    public RespPedidoDto obtener(Long id);

    public List<PedidoDtoCarrito> listarPorCarrito(Carrito carrito);
}
