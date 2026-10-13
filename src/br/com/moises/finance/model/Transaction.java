package br.com.moises.finance.model;

import java.math.BigDecimal;

public class Transaction {

    private int id;
    private String description;
    private BigDecimal amount;
    private Category category;
    private Account account;
}
