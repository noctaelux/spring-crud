package com.example.springcrud.repositories;

import com.example.springcrud.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoJpaRepository extends JpaRepository<Producto, Long> {


}
