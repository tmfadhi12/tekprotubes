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

    @Column(name = "seller_storename")
    private String sellerStorename;

    @Column(name = "buyername")
    private String buyerName;

    @Column(name = "telp")
    private String noTelp;

    @Column(name = "address")
    private String address;

    @Column(name = "ordernotes")
    private String orderNotes;

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes;
    }

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

    public String getSeller_storename() {
        return sellerStorename;
    }

    public void setSeller_storename(String seller_storename) {
        this.sellerStorename = seller_storename;
    }

    public Timestamp getDate() {
        return date;
    }

    public Transaction(String productName, String sellerStorename, String buyerName, String noTelp, String address, String orderNotes){
        setProduct_name(productName);
        setSeller_storename(sellerStorename);
        setBuyerName(buyerName);
        setNoTelp(noTelp);
        setAddress(address);
        setOrderNotes(orderNotes);
    }

    public Transaction(){

    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSellerStorename() {
        return sellerStorename;
    }

    public void setSellerStorename(String sellerStorename) {
        this.sellerStorename = sellerStorename;
    }
}
