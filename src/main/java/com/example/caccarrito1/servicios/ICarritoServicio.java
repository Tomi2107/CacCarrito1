package com.example.caccarrito1.servicios;

import com.example.caccarrito1.dto.CarritoDto;
import com.example.caccarrito1.dto.RespCarritoDto;

import java.util.List;

public interface ICarritoServicio {
    public RespCarritoDto agregar(CarritoDto carritoDto);
    public RespCarritoDto eliminar(Long id);
    public List<CarritoDto> listar();
    public RespCarritoDto obtener(Long id);
}
