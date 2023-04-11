package econ.ecommerce.Controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import econ.ecommerce.Model.Seller;
import econ.ecommerce.Repo.SellerRepo;

@RestController
public class SellerController {
    @Autowired
    private SellerRepo sellerrepo;

    @GetMapping("/seller")
    public List<Seller> getSeller(){
        return sellerrepo.findAll();
    }

    @PostMapping("/seller")
    public Seller createSeller(@RequestParam String username, String password, String storename, Integer credit){
        Seller saved = new Seller(username, password, storename, credit);
        return sellerrepo.save(saved);
    }

    @GetMapping("/seller/byusername")
    public List<Seller> getSellerByUsername(@RequestParam("sellerUsername") String SellerUsername){
        return sellerrepo.findBySellerUsernameContainingIgnoreCase(SellerUsername);
    }


}
