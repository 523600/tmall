package com.jsx.tmall.Dao;

import com.jsx.tmall.Entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandDao extends JpaRepository<Brand,Long> {
    Brand findById(long id);
}
