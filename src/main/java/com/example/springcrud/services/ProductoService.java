package com.example.springcrud.services;

import com.example.springcrud.dto.ProductoDTO;

import java.util.List;

public interface ProductoService {

    ProductoDTO get(Long id);
    List<ProductoDTO> getAll();
    ProductoDTO create(ProductoDTO producto);
    ProductoDTO update(ProductoDTO producto);
    void delete(Long id);

}
