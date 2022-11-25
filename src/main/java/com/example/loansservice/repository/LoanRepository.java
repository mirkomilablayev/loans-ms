package com.example.loansservice.repository;

import com.example.loansservice.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findAllByCustomerId(Long customerId);
}
