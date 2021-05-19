package com.jsx.tmall.Service;

import com.jsx.tmall.Dao.ManufacturerDao;
import com.jsx.tmall.Dao.ProductDao;
import com.jsx.tmall.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public void add(Product product){
        product.setCreate_time(new Date());
        productDao.save(product);
    }

    public void update_status(Product product){
        String status=product.getStatus();
        if(status.equals("saled")){
            product.setStatus("unsaled");
        }else {
            product.setStatus("saled");
        }
        productDao.save(product);
    }

    public void update_sale_volume(Product product){
        int volume=product.getSales_volume();
        product.setSales_volume(volume+1);
        productDao.save(product);
    }

    public void update_discount(Product product){
        productDao.save(product);
    }

    public void delete(Product product){
        productDao.delete(product);
    }

    public List<Product> findbybrand(String brand){
        return productDao.findAllByBrand(brand);
    }

    public List<Product> findAll(){
        return productDao.findAll();
    }

}
