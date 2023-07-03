package com.example.caccarrito1.servicios;

import com.example.caccarrito1.dto.ClienteDto;
import com.example.caccarrito1.dto.RespClienteDto;

import java.util.List;

public interface IClienteServicio {
    public RespClienteDto agregar(ClienteDto clienteDto);
    public RespClienteDto eliminar(Long id);
    public List<ClienteDto> listar();
    public RespClienteDto obtener(Long id);
}
