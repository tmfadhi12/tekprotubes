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
    private Integer transaction_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "quantity")
    private Integer product_quantity;

    @Column(name = "seller_storename")
    private String seller_storename;

    @Column(name = "date")
    private final Timestamp date = Timestamp.valueOf(LocalDateTime.now());

    public Integer getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Integer transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getSeller_storename() {
        return seller_storename;
    }

    public void setSeller_storename(String seller_storename) {
        this.seller_storename = seller_storename;
    }

    public Timestamp getDate() {
        return date;
    }

    public Transaction(){

    }
}
