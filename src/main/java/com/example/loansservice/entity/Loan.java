package com.example.loansservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;
    @Column(nullable = false)
    private Long customerId;
    private LocalDate startDt;
    private String loanType;
    private Double totalLoan;
    private Double amountPaid;
    private Double outstandingAmount;
    private LocalDate createdAt = LocalDate.now();
}
