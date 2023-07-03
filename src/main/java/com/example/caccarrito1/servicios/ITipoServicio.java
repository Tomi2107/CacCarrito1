package com.example.caccarrito1.servicios;

import com.example.caccarrito1.dto.RespTipoDto;
import com.example.caccarrito1.dto.TipoDto;

import java.util.List;

public interface ITipoServicio {
    public RespTipoDto agregar(TipoDto tipoDto);
    public RespTipoDto eliminar(Long id);
    public List<TipoDto> listar();
    public RespTipoDto obtener(Long id);
}
