package econ.ecommerce.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import econ.ecommerce.Model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer>{
    
}
