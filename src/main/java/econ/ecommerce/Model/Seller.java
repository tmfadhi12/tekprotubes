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

    public Seller(String sellerUsername, String sellerPassword, String sellerStorename, Integer sellerCredit) {
        this.sellerUsername = sellerUsername;
        this.sellerPassword = sellerPassword;
        this.sellerStorename = sellerStorename;
        this.sellerCredit = sellerCredit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seller_id")
    private Integer id;

    @Column(name = "seller_user")
    private String sellerUsername;

    @Column(name = "seller_pass")
    private String sellerPassword;

    @Column(name = "storename")
    private String sellerStorename;

    @Column(name = "credit")
    private Integer sellerCredit;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getsellerUsername() {
        return sellerUsername;
    }
    public void setsellerUsername(String sellerUsername) {
        this.sellerUsername = sellerUsername;
    }
    public String getsellerPassword() {
        return sellerPassword;
    }
    public void setsellerPassword(String sellerPassword) {
        this.sellerPassword = sellerPassword;
    }
    public String getsellerStorename() {
        return sellerStorename;
    }
    public void setsellerStorename(String sellerStorename) {
        this.sellerStorename = sellerStorename;
    }
    public Integer getsellerCredit() {
        return sellerCredit;
    }
    public void setsellerCredit(Integer sellerCredit) {
        this.sellerCredit = sellerCredit;
    }

    public Seller(){
        
    }

}
