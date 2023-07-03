package com.example.caccarrito1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespMarcaDto {
    private MarcaDto marca;
    private String mensaje;
}
