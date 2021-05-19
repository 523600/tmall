package com.jsx.tmall.Service;

import com.jsx.tmall.Dao.BrandDao;
import com.jsx.tmall.Dao.Manu_brandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Manu_brandService {
    @Autowired
    private Manu_brandDao manu_brandDao;
    @Autowired
    private BrandDao brandDao;


    public void deleteByBrand_id(long id){
        long id1=brandDao.findById(id).getId();
        manu_brandDao.deleteByBrandid(id1);
    }
}
