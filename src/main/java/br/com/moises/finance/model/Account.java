package br.com.moises.finance.model;
import java.math.BigDecimal;

public class Account {
    private Long id;
    private final User owner;
    private String name;
    private BigDecimal initialBalance;

    public Account(Long id, String name, User owner, BigDecimal initialBalance) {
        validateName(name);

        if (owner == null) {
            throw new IllegalArgumentException("Account owner must not be null.");
        }

        if (initialBalance == null) {
            throw new IllegalArgumentException("Initial balance must not be null.");
        }

        this.id = id;
        this.name = name;
        this.owner = owner;
        this.initialBalance = initialBalance;
    }

    public void rename(String newName) {
        validateName(newName);
        this.name = newName;
    }

    private static void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Account name must not be null or blank.");
        }
    }

    public Long getId() {
        return this.id;
    }

    public User getOwner() {
        return this.owner;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getInitialBalance() {
        return this.initialBalance;
    }
}
