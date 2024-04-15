package com.challenge.churn.repo;

import com.challenge.churn.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
}
