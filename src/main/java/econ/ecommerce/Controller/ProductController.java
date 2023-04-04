package econ.ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import econ.ecommerce.Model.Product;
import econ.ecommerce.Repo.ProductRepo;

@RestController
public class ProductController {
    @Autowired
    private ProductRepo productrepo;

    @GetMapping("/product")
    public List<Product> getSeller(){
        return productrepo.findAll();
    }

    @PostMapping("/product")
    public Product createProduct(@RequestBody Product product){
        return productrepo.save(product);
    }
}
