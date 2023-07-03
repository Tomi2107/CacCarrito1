package com.example.caccarrito1.servicios;

import com.example.caccarrito1.dto.ProductoDto;
import com.example.caccarrito1.dto.RespProductoDto;

import java.util.List;

public interface IProductoServicio {
    public RespProductoDto agregar(ProductoDto productoDto);
    public RespProductoDto eliminar(Long id);
    public List<ProductoDto> listar();
    public RespProductoDto obtener(Long id);
}
