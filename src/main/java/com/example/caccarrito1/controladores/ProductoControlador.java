package com.example.caccarrito1.controladores;

import com.example.caccarrito1.dto.ProductoDto;
import com.example.caccarrito1.servicios.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductoControlador {

    @Autowired
    private IProductoServicio productoServicio;

    @GetMapping("/productos")
    public ResponseEntity<?> obtenerProductos() {
        return new ResponseEntity<>(productoServicio.listar(), HttpStatus.OK);
    }

    @PostMapping("/productos/nuevo")
    public ResponseEntity<?> guardarProducto(@RequestBody ProductoDto producto){
        return new ResponseEntity<>(productoServicio.agregar(producto),HttpStatus.OK);
    }

    @DeleteMapping("/productos/eliminar/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable Long id){
        return new ResponseEntity<>(productoServicio.eliminar(id),HttpStatus.OK);
    }

    @GetMapping("/productos/obtener/{id}")
    public ResponseEntity<?> obtenerProductoPorId(@PathVariable Long id){
        return new ResponseEntity<>(productoServicio.obtener(id),HttpStatus.OK);
    }
}
