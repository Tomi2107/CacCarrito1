package com.example.caccarrito1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespClienteDto {
    private ClienteDto cliente;
    private String mensaje;
}
