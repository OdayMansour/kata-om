package com.om.bank;

import com.om.bank.assets.*;
import com.om.bank.printers.AccountPrinter;

import java.math.BigDecimal;
import java.util.Date;

public class AccountManager {

    public static void main(String[] args) {

        System.out.println("Bank Account Kata \n");

        Account sampleAccount = new Account("1", "1", "Sample Account");

        sampleAccount.addTransaction(new Transaction(1, new Date() , TransactionType.CREDIT, BigDecimal.valueOf(5000.00), "Paycheck"));
        sampleAccount.addTransaction(new Transaction(2, new Date(), TransactionType.DEBIT, BigDecimal.valueOf(-1000.00), "Rent"));
        sampleAccount.addTransaction(new Transaction(3, new Date(), TransactionType.DEBIT, BigDecimal.valueOf(-750.00), "Car payment"));
        sampleAccount.addTransaction(new Transaction(4, new Date() , TransactionType.CREDIT, BigDecimal.valueOf(1320.00), "Tax return"));
        sampleAccount.addTransaction(new Transaction(5, new Date(), TransactionType.DEBIT, BigDecimal.valueOf(-643.25), "Plane ticket"));

        System.out.println(AccountPrinter.printAccount(sampleAccount));

    }

}
