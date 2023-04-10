package econ.ecommerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Product createProduct(@RequestParam String productName, Integer productStock, Integer productPrice, String sellerStorename){
        Product saved = new Product(productName, productStock, productPrice, sellerStorename);
        return productrepo.save(saved);
    }

    @PutMapping("/product/{id}/stokupdate")
    public Product updatestokProduct(@PathVariable Integer id, @RequestParam("stok") Integer productStock){
        Product product = productrepo.findById(id).get();
        product.setProduct_stock(productStock);
        return productrepo.save(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productrepo.deleteById(id);
    }
}
