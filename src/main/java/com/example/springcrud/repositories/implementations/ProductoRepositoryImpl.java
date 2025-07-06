package com.example.springcrud.repositories.implementations;

import com.example.springcrud.models.Producto;
import com.example.springcrud.repositories.ProductoJpaRepository;
import com.example.springcrud.repositories.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class ProductoRepositoryImpl implements ProductoRepository {

    private final ProductoJpaRepository productoJpaRepository;

    @Override
    public List<Producto> findAll() {
        return productoJpaRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoJpaRepository.findById(id);
    }

    @Override
    public Optional<Producto> save(Producto producto) {
        return Optional.of(productoJpaRepository.save(producto));
    }

    @Override
    public Optional<Producto> update(Producto producto) {
        return Optional.of(productoJpaRepository.save(producto));
    }

    @Override
    public void deleteById(Long id) {
        productoJpaRepository.deleteById(id);
    }
}
