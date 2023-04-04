package econ.ecommerce.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "stock")
    private Integer product_stock;

    @Column(name = "price")
    private Integer product_price;

    @Column(name = "seller_storename")
    private String seller_storename;

    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(Integer product_stock) {
        this.product_stock = product_stock;
    }
    
    public Integer getProduct_price() {
        return product_price;
    }
    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }
    public String getSeller_storename() {
        return seller_storename;
    }
    public void setSeller_storename(String seller_storename) {
        this.seller_storename = seller_storename;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Product(){
        
    }
    
    public Product(Integer product_id, String product_name, Integer product_stock, Integer product_price,
            String seller_storename) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_stock = product_stock;
        this.product_price = product_price;
        this.seller_storename = seller_storename;
    }
    
    public Product(String product_name, Integer product_stock, Integer product_price,
            String seller_storename) {
        this.product_name = product_name;
        this.product_stock = product_stock;
        this.product_price = product_price;
        this.seller_storename = seller_storename;
    }
}
