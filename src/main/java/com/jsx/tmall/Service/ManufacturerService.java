package com.jsx.tmall.Service;

import com.jsx.tmall.Dao.BrandDao;
import com.jsx.tmall.Dao.Manu_brandDao;
import com.jsx.tmall.Dao.ManufacturerDao;
import com.jsx.tmall.Entity.Brand;
import com.jsx.tmall.Entity.Manufacturer;
import com.jsx.tmall.Entity.Manufacturer_brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerDao manufacturerDao;
    @Autowired
    private Manu_brandDao manu_brandDao;
    @Autowired
    private BrandDao brandDao;

    public int total_sales_volume(Manufacturer manufacturer){
        List<Manufacturer> list=manufacturerDao.findAll();
        int sum=0;
        for(Manufacturer i:list){
            sum+=i.getSale_volume();
        }
        return sum;
    }

    public void add(Manufacturer manufacturer, Brand brand){
        manufacturer.setSale_volume(0);
        long id1=manufacturerDao.save(manufacturer).getId();
        long id2=brandDao.save(brand).getId();

        Manufacturer_brand manufacturer_brand=new Manufacturer_brand();
        manufacturer_brand.setManufacturerid(id1);
        manufacturer_brand.setBrandid(id2);
        manu_brandDao.save(manufacturer_brand);
    }

}
