package com.jithin.Ecommerce.repositories;

import com.jithin.Ecommerce.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRespository extends CrudRepository<Product, Long> {
}
