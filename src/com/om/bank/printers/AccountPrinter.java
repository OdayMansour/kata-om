package com.om.bank.printers;

import com.om.bank.assets.Account;
import com.om.bank.assets.Transaction;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AccountPrinter {

    // // Members
    private static final String transactionHeader = "Transaction history: ";
    private static final String tableHeader = "  ID | Date                         | Comments                                           |  Type  |        Value |      Balance |";
    private static final String balanceHeader = "Available balance: ";

    // // Methods
    public AccountPrinter() { super(); }
    public static String printAccount(Account account) {
        String output = "";
        ArrayList<Transaction> transactions = account.getTransactionList();

        output += transactionHeader + System.lineSeparator();
        output += tableHeader + System.lineSeparator();

        output += populateTransactions(transactions);

        output += balanceHeader + System.lineSeparator();
        output += String.format("%+,12.2f", account.getBalance());

        return output;
    }

    public static String populateTransactions(ArrayList<Transaction> transactions) {
        BigDecimal runningBalance = BigDecimal.ZERO;
        String output = "";
        for (int i=0; i<transactions.size(); i++) {
            runningBalance = runningBalance.add(transactions.get(i).getValue());
            output += TransactionPrinter.printTransactionWithBalance(transactions.get(i), runningBalance) + System.lineSeparator();
        }
        return output;
    }

}
