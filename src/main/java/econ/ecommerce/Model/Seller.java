package econ.ecommerce.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seller_id")
    private Integer id;

    @Column(name = "seller_user")
    private String seller_username;

    @Column(name = "seller_pass")
    private String seller_password;

    @Column(name = "storename")
    private String seller_storename;

    @Column(name = "credit")
    private Integer seller_credit;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSeller_username() {
        return seller_username;
    }
    public void setSeller_username(String seller_username) {
        this.seller_username = seller_username;
    }
    public String getSeller_password() {
        return seller_password;
    }
    public void setSeller_password(String seller_password) {
        this.seller_password = seller_password;
    }
    public String getSeller_storename() {
        return seller_storename;
    }
    public void setSeller_storename(String seller_storename) {
        this.seller_storename = seller_storename;
    }
    public Integer getSeller_credit() {
        return seller_credit;
    }
    public void setSeller_credit(Integer seller_credit) {
        this.seller_credit = seller_credit;
    }

    public Seller(){
        
    }

    public Seller(Integer id, String seller_username, String seller_password, String seller_storename,
            Integer seller_credit) {
        this.id = id;
        this.seller_username = seller_username;
        this.seller_password = seller_password;
        this.seller_storename = seller_storename;
        this.seller_credit = seller_credit;
    } 
    
    public Seller(String seller_username, String seller_password, String seller_storename,
            Integer seller_credit) {
        this.seller_username = seller_username;
        this.seller_password = seller_password;
        this.seller_storename = seller_storename;
        this.seller_credit = seller_credit;
    } 

}
