package com.example.springcrud.repositories;

import com.example.springcrud.models.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository {

    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    Optional<Producto> save(Producto producto);
    Optional<Producto> update(Producto producto);
    void deleteById(Long id);

}
