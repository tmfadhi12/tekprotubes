package econ.ecommerce.Model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private Integer transactionId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "quantity")
    private Integer productQuantity;

    @Column(name = "seller_storename")
    private String sellerStorename;

    @Column(name = "date")
    private final Timestamp date = Timestamp.valueOf(LocalDateTime.now());

    public Integer getTransaction_id() {
        return transactionId;
    }

    public void setTransaction_id(Integer transaction_id) {
        this.transactionId = transaction_id;
    }

    public String getProduct_name() {
        return productName;
    }

    public void setProduct_name(String product_name) {
        this.productName = product_name;
    }

    public Integer getProduct_quantity() {
        return productQuantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.productQuantity = product_quantity;
    }

    public String getSeller_storename() {
        return sellerStorename;
    }

    public void setSeller_storename(String seller_storename) {
        this.sellerStorename = seller_storename;
    }

    public Timestamp getDate() {
        return date;
    }

    public Transaction(){

    }
}
