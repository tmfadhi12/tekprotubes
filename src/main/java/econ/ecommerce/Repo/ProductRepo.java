package econ.ecommerce.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import econ.ecommerce.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}
