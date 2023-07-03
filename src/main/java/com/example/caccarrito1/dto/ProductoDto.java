package com.example.caccarrito1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private Long id;
    //private String codigo;
    private String nombre;
    private String descripcion;
    //private Integer stock;
    private Double precio;
    private String foto;
    private Integer peso;
    private CategoriaDto categoria;
    private TipoDto tipo;
    private MarcaDto marca;
}
