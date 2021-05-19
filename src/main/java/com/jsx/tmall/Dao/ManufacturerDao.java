package com.jsx.tmall.Dao;

import com.jsx.tmall.Entity.Brand;
import com.jsx.tmall.Entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManufacturerDao extends JpaRepository<Manufacturer,Long> {
    @Override
    List<Manufacturer> findAll();
}
