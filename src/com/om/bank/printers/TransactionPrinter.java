package com.om.bank.printers;

import com.om.bank.assets.Transaction;

import java.math.BigDecimal;

public class TransactionPrinter {

    // // Members
    private static final String rowFormat = " %3s | %s | %-50s | %6s | %+,12.2f |";

    // // Methods
    // Constructors
    public TransactionPrinter() { super(); }

    public static String printTransaction(Transaction transaction) {
        String output = String.format(rowFormat,
                transaction.getId(),
                transaction.getDate(),
                transaction.getComment(),
                transaction.getTypeString(),
                transaction.getValue()
        );
        return output;
    }

    public static String printTransactionWithBalance(Transaction transaction, BigDecimal runningBalance) {
        String output = printTransaction(transaction);
        output += String.format(" %+,12.2f |", runningBalance);
        return output;
    }

}
