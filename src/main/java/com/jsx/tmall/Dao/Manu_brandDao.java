package com.jsx.tmall.Dao;

import com.jsx.tmall.Entity.Manufacturer_brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Manu_brandDao extends JpaRepository<Manufacturer_brand,Long> {
    public void deleteByBrandid(long id);
}
