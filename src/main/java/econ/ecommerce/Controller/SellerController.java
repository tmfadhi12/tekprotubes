package econ.ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Seller createSeller(@RequestBody Seller seller){
        return sellerrepo.save(seller);
    }
}
