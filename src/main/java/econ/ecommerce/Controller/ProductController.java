package econ.ecommerce.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import econ.ecommerce.Model.Product;
import econ.ecommerce.Repo.ProductRepo;

@Controller
public class ProductController{
    @Autowired
    private ProductRepo productrepo;

    @GetMapping("/product/{id}")
    public String getOneProduct(Model model, @PathVariable Integer id) {
        try {
            model.addAttribute("existproduct", productrepo.findById(id).get());
        } catch (Exception e) {
            model.addAttribute("test", new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.BAD_REQUEST));
        }
        return "ecommerce/editproduct";
    }

    @GetMapping("/checkout/{id}")
    public String goToCheckout(Model model, @PathVariable Integer id) {
        try {
            model.addAttribute("existproduct", productrepo.findById(id).get());
        } catch (Exception e) {
            model.addAttribute("test", new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.BAD_REQUEST));
        }
        return "ecommerce/CHECKOUT";
    }

    @GetMapping("/")
    public String getProduct(Model model) {
        try {
            model.addAttribute("productlist", productrepo.findAll());
        } catch (Exception e) {
            new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
        }
        return "ecommerce/index";
    }

    @GetMapping("/admin")
    public String adminPage(Model model) {
        try {
            model.addAttribute("productlist", productrepo.findAll());
        } catch (Exception e) {
            new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
        }
        return "ecommerce/ADMIN";
    }

    @GetMapping("/addproduct")
    public String addProductPage() {
        return "ecommerce/addproduct";
    }

    @PostMapping("/product")
    public String createProduct(@RequestParam String productName, Integer productStock, Integer productPrice,
            String imageUrl, String sellerStorename) {
        try {
            Product saved = new Product(productName, productStock, productPrice, imageUrl, sellerStorename);
            productrepo.save(saved);
        } catch (Exception e) {
            new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.NOT_FOUND);
        }
        return "redirect:/addproduct";
    }

    @PostMapping("/product/{id}")
    public String updateProduct(@ModelAttribute Product pr, @PathVariable Integer id) {
        try {
            Product existProduct = productrepo.findById(id).orElseThrow(() -> new RuntimeException(
                    String.format("Cannot Find Product by ID %s", id)));
            existProduct.setProduct_name(
                    pr.getProduct_name() == null ? existProduct.getProduct_name() : pr.getProduct_name());
            existProduct.setProduct_price(
                    pr.getProduct_price() == null ? existProduct.getProduct_price() : pr.getProduct_price());
            existProduct.setProduct_stock(
                    pr.getProduct_stock() == null ? existProduct.getProduct_stock() : pr.getProduct_stock());
            existProduct.setSeller_storename(
                    pr.getSeller_storename() == null ? existProduct.getSeller_storename() : pr.getSeller_storename());
            existProduct.setImageUrl(pr.getImageUrl() == null ? existProduct.getImageUrl() : pr.getImageUrl());
            productrepo.save(existProduct);

        } catch (NoSuchElementException e) {
            new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.NOT_FOUND);
        }

        return "redirect:/admin";
    }

    @PostMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        try {
            productrepo.deleteById(id);
        } catch (Exception e) {
            new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.NOT_FOUND);
        }
        return "redirect:/admin";
    }

    // @PostMapping("buyproduct/{id}")
    // public String buyProduct(@PathVariable Integer id){
    //     Product singleProducts = productrepo.findById(id).orElseThrow(() -> new RuntimeException(
    //         String.format("Cannot Find Product by ID %s", id)));
    //         singleProducts.setProduct_stock(singleProducts.getProduct_stock()-1);
    //         productrepo.save(singleProducts);
    //     return "redirect:/";
    // }
}
