package com.jsx.tmall.Service;

import com.jsx.tmall.Dao.BrandDao;
import com.jsx.tmall.Entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {
    @Autowired
    private BrandDao brandDao;

    public Brand findById(long id){
        return brandDao.findById(id);
    }
}
