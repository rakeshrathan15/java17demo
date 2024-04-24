package org.example.streamsdemomap;

import java.util.Date;

public class AccountDetails {


     public Date transactionDate;
     public Date valueDate;
     public String type;
     public double amount;
     public String  description;

     public String accountNumber;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "transactionDate=" + transactionDate +
                ", valueDate=" + valueDate +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
