package com.example.caccarrito1.controladores;

import com.example.caccarrito1.dto.MarcaDto;
import com.example.caccarrito1.servicios.IMarcaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarcaControlador {
    @Autowired
    private IMarcaServicio marcaServicio;

    @GetMapping("/marcas")
    public ResponseEntity<?> obtenerMarcas() {
        return new ResponseEntity<>(marcaServicio.listar(), HttpStatus.OK);
    }

    @PostMapping("/marcas/nuevo")
    public ResponseEntity<?> guardarMarca(@RequestBody MarcaDto marca){
        return new ResponseEntity<>(marcaServicio.agregar(marca),HttpStatus.OK);
    }

    @DeleteMapping("/marcas/eliminar/{id}")
    public ResponseEntity<?> eliminarMarca(@PathVariable Long id){
        System.out.println(id);
        return new ResponseEntity<>(marcaServicio.eliminar(id),HttpStatus.OK);
    }

    @GetMapping("/marcas/obtener/{id}")
    public ResponseEntity<?> obtenerMarcaPorId(@PathVariable Long id){
        return new ResponseEntity<>(marcaServicio.obtener(id),HttpStatus.OK);
    }
}
