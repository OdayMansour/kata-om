package com.om.bank.assets;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {

    // // Members
    // Relational
    private String accountID;
    private String userID;

    // Customer defined
    private String accountName;

    // Financials
    private ArrayList<Transaction> transactionList;
    private BigDecimal balance;

    // // Methods
    // Constructors
    public Account() {
        super();
        this.transactionList = new ArrayList<Transaction>();
        this.balance = BigDecimal.ZERO;
    }

    public Account(String accountID, String userID, String accountName) {
        super();
        this.accountID = accountID;
        this.userID = userID;
        this.accountName = accountName;
        this.transactionList = new ArrayList<Transaction>();
        this.balance = BigDecimal.ZERO;
    }

    // Accessors
    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal addTransaction( Transaction transaction ) {
        this.transactionList.add(transaction);
        this.balance = this.balance.add(transaction.getValue());
        return this.balance;
    }
}
