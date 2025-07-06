package com.example.springcrud.api;


import com.example.springcrud.dto.ProductoDTO;
import com.example.springcrud.services.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/producto")
public class ProductoApi {

    private final ProductoService productoService;

    @GetMapping("/lista")
    public List<ProductoDTO> traeProductos(){
        return productoService.getAll();
    }

    @GetMapping(path = "/{id}")
    public ProductoDTO getProducto(@PathVariable("id") Long id){
        return productoService.get(id);
    }

    @PostMapping
    public ProductoDTO create(@RequestBody ProductoDTO producto) {
        return productoService.create(producto);
    }

    @PutMapping
    public ProductoDTO update(@RequestBody ProductoDTO producto) {
        return productoService.update(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        productoService.delete(id);
    }

}
