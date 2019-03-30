package com.jithin.Ecommerce.services.exception;

public class ProductNotFoundNotException  extends RuntimeException {
    public ProductNotFoundNotException(Long id) {
        super("product not found with this "+id);
    }
}
