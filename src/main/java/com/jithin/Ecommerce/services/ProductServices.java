package com.jithin.Ecommerce.services;

import com.jithin.Ecommerce.models.Product;
import com.jithin.Ecommerce.models.Response;
import com.jithin.Ecommerce.models.Status;
import com.jithin.Ecommerce.repositories.ProductRespository;
import com.jithin.Ecommerce.services.exception.ProductNotFoundNotException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

import static com.jithin.Ecommerce.models.Status.SUCCESS;

@Service
public class ProductServices {

    @Autowired
    private final ProductRespository productRespository;


    public ProductServices(ProductRespository productRespository) {
        this.productRespository = productRespository;
    }



    public Response<Collection<Product>> getAllProducts(){
        return new Response<Collection<Product>>((Collection<Product>) productRespository.findAll(), SUCCESS, null);
    }

    public Response<Product> createNewProduct(Product product){
        return new Response<>(productRespository.save(product), SUCCESS, null);
    }

    public Response<Product> getProductById(Long id){


        Product product = productRespository.findById(id).orElseThrow(
                () -> new ProductNotFoundNotException(id)
        );

        return new Response<>(product, SUCCESS, null);
    }










}
