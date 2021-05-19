package com.jsx.tmall.Controller;

import com.jsx.tmall.Dao.ProductDao;
import com.jsx.tmall.Service.ProductService;
import com.jsx.tmall.Utils.RequestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class Product {
    @Autowired
    private ProductDao productDao;
    @GetMapping ("/add")
    public RequestResult<Product> add(Product product){
       // productDao.add(product);
        return RequestResult.SUCCESS(product,"yes");
    }

}
