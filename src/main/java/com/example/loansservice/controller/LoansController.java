package com.example.loansservice.controller;

import com.example.loansservice.entity.Customer;
import com.example.loansservice.entity.Loan;
import com.example.loansservice.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoansController {

    private final LoanRepository loanRepository;

    @PostMapping("/myLoans")
    public List<Loan> getLoanDetails(@RequestBody Customer customer){
        return loanRepository.findAllByCustomerId(customer.getCustomerId());
    }
}
