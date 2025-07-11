package com.duvan.springboot.di.app.springboot_di.repositories;

import java.util.List;

import java.util.Arrays;

import com.duvan.springboot.di.app.springboot_di.models.Product;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository(){
        this.data = Arrays.asList(
            new Product(1L,"Corssair Memory",300L),
            new Product(2L,"CPU intell core i 9", 850L),
            new Product(3L,"Rayzen Mini Keyboard", 180L),
            new Product(4L,"Motherboard gigabyte", 490L)

        );
    }
    public  List<Product> findAll(){
        return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p-> p.getId().equals(id)).findFirst().orElse(null);
    }

}
