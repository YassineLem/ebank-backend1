package com.example.ebankbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AccountOperation {
    private Long id;
    private Date operationDate;
    private double amount;
    private  OperationType type;
    private  BankAccount bankAccount;
}
