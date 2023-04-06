package econ.ecommerce.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import econ.ecommerce.Model.Seller;

public interface SellerRepo extends JpaRepository<Seller, Integer>{
    List<Seller> findBySellerUsernameContainingIgnoreCase(String seller_username);
}
