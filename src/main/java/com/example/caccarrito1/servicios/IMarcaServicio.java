package com.example.caccarrito1.servicios;

import com.example.caccarrito1.dto.MarcaDto;
import com.example.caccarrito1.dto.RespMarcaDto;

import java.util.List;

public interface IMarcaServicio {

    public RespMarcaDto agregar(MarcaDto marcaDto);
    public RespMarcaDto eliminar(Long id);
    public List<MarcaDto> listar();
    public RespMarcaDto obtener(Long id);
}
