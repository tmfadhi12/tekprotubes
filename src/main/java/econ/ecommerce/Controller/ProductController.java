package econ.ecommerce.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @PutMapping("/product/{id}")
    public ResponseEntity<Object> updateProduct(@RequestBody Product pr, @PathVariable Integer id){
        try {
            Product existProduct = productrepo.findById(id).orElseThrow(()-> new RuntimeException(
                String.format("Cannot Find Expense by ID %s", id)
            ));
            existProduct.setProduct_name(pr.getProduct_name() == null ? existProduct.getProduct_name() : pr.getProduct_name());
            existProduct.setProduct_price(pr.getProduct_price() == null ? existProduct.getProduct_price() : pr.getProduct_price());
            existProduct.setProduct_stock(pr.getProduct_stock() == null ? existProduct.getProduct_stock() : pr.getProduct_stock());
            productrepo.save(existProduct);
            return new ResponseEntity<>(HttpStatus.OK); 
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productrepo.deleteById(id);
    }
}
