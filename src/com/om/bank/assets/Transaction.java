package com.om.bank.assets;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

    // // Members
    private int id;
    private Date date;
    private TransactionType type;
    private BigDecimal value;
    private String comment;

    // // Methods
    // Constructors
    public Transaction() { super(); }
    public Transaction(int id, Date date, TransactionType type, BigDecimal value, String comment) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.value = value;
        this.comment = comment;
    }

    // Accessors
    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public TransactionType getType() {
        return type;
    }

    public String getTypeString() {
        return type.toString();
    }

    public String getComment() {
        return comment;
    }
}
