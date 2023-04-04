package econ.ecommerce.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import econ.ecommerce.Model.Seller;

public interface SellerRepo extends JpaRepository<Seller, Integer>{
    
}
