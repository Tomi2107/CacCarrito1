package com.example.caccarrito1.servicios;

import com.example.caccarrito1.dto.CategoriaDto;
import com.example.caccarrito1.dto.RespCategoriaDto;

import java.util.List;

public interface ICategoriaServicio {
    public RespCategoriaDto agregar(CategoriaDto categoriaDto);
    public RespCategoriaDto eliminar(Long id);
    public List<CategoriaDto> listar();
    public RespCategoriaDto obtener(Long id);
}
