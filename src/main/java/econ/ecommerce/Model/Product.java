package econ.ecommerce.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "product")
public class Product {

    public Product(String productName, Integer productStock, Integer productPrice, String imageUrl, String sellerStorename) {
        this.productName = productName;
        this.productStock = productStock;
        this.productPrice = productPrice;
        this.imageUrl = imageUrl;
        this.sellerStorename = sellerStorename;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "product_name")
    private String productName;

    // @Min(value = 0L, message = "Must be Integer with minimun value is 0")
    @Column(name = "stock")
    private Integer productStock;

    @Column(name = "price")
    private Integer productPrice;

    @Column(name = "image")
    private String imageUrl;

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Column(name = "seller_storename")
    private String sellerStorename;

    public String getProduct_name() {
        return productName;
    }
    public void setProduct_name(String product_name) {
        this.productName = product_name;
    }

    public Integer getProduct_stock() {
        return productStock;
    }

    public void setProduct_stock(Integer product_stock) {
        this.productStock = product_stock;
    }
    
    public Integer getProduct_price() {
        return productPrice;
    }
    public void setProduct_price(Integer product_price) {
        this.productPrice = product_price;
    }
    public String getSeller_storename() {
        return sellerStorename;
    }
    public void setSeller_storename(String seller_storename) {
        this.sellerStorename = seller_storename;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
    
    public Product(){

    }

    public void orElseThrow(Object object) {
    }

}
