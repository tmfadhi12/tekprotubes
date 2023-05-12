package econ.ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import econ.ecommerce.Model.Product;
import econ.ecommerce.Model.Transaction;
import econ.ecommerce.Repo.ProductRepo;
import econ.ecommerce.Repo.TransactionRepo;

@Controller
public class TransactionController {
    @Autowired
    private TransactionRepo tr;

    @Autowired
    private ProductRepo productrepo;

    @GetMapping("/transactionHistory")
    public String getSeller(Model model){
        model.addAttribute("listTr", tr.findAll());
        return "ecommerce/history";
    }

    @PostMapping("/transaction")
    public String createProduct(@RequestParam String productName, String sellerStorename, String buyerName, String noTelp, String address, String orderNotes, Integer id){
        Transaction saved = new Transaction(productName, sellerStorename, buyerName, noTelp, address, orderNotes);
        // changing stock
        Product singleProducts = productrepo.findById(id).orElseThrow(() -> new RuntimeException(
            String.format("Cannot Find Product by ID %s", id)));
            singleProducts.setProduct_stock(singleProducts.getProduct_stock()-1);

        tr.save(saved);
        productrepo.save(singleProducts);

        return "redirect:/";
    }
}
