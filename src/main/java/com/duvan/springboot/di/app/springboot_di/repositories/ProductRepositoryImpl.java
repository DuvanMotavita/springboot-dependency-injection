package com.duvan.springboot.di.app.springboot_di.repositories;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

import com.duvan.springboot.di.app.springboot_di.models.Product;


@Primary
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> data;

    public ProductRepositoryImpl(){
        this.data = Arrays.asList(
            new Product(1L,"Corssair Memory",300L),
            new Product(2L,"CPU intell core i 9", 850L),
            new Product(3L,"Rayzen Mini Keyboard", 180L),
            new Product(4L,"Motherboard gigabyte", 490L)

        );
    }
    @Override
    public  List<Product> findAll(){
        return data;
    }

    @Override
    public Product findById(Long id){
        return data.stream().filter(p-> p.getId().equals(id)).findFirst().orElse(null);
    }

}
