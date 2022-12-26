package com.talitadev.tscommerce.repositories;

import com.talitadev.tscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
