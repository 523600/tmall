package com.jsx.tmall.Dao;

import com.jsx.tmall.Entity.Product;
import org.springframework.data.jpa.mapping.JpaPersistentProperty;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends  JpaRepository<Product,Long> {

    public String findByBrand(String brand);
    public String findByName(String name);
    public String findByNameAndPrice(String name,String price);
    public List<Product> findAllByBrand(String brand);
}
