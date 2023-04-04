package econ.ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import econ.ecommerce.Model.Transaction;
import econ.ecommerce.Repo.TransactionRepo;

@RestController
public class TransactionController {
    @Autowired
    private TransactionRepo tr;

    @GetMapping("/transaction")
    public List<Transaction> getSeller(){
        return tr.findAll();
    }

    @PostMapping("/transaction")
    public Transaction createProduct(@RequestBody Transaction product){
        return tr.save(product);
    }
}
