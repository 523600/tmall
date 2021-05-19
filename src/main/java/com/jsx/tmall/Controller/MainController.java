package com.jsx.tmall.Controller;

import com.jsx.tmall.Dao.ProductDao;
import com.jsx.tmall.Entity.Product;
import com.jsx.tmall.Service.ProductService;
import com.jsx.tmall.Utils.RequestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/Addproduct",method = RequestMethod.POST)
    public RequestResult add(Product product){
        System.out.println(product.getName());
//   product.setName("ssasa");
//        System.out.println("sss");
        productService.add(product);
        return RequestResult.SUCCESS(product);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public RequestResult update(@PathVariable(name="id")long id,@RequestBody Product product){
        product.setBrand("sss");
        productService.add(product);
        return RequestResult.SUCCESS(product);

    }

    @RequestMapping(value = "/{brand}",method = RequestMethod.GET)
    public RequestResult<List<Product>> findproductbybrand(@PathVariable(name="brand") String brand){
        productService.findbybrand(brand);
        return RequestResult.SUCCESS(productService.findbybrand(brand));
    }

    @RequestMapping(value = "/deleteproduct",method = RequestMethod.DELETE)
    public RequestResult<Product> delete(Product product){
        productService.delete(product);
        return RequestResult.SUCCESS(product);
    }
}
