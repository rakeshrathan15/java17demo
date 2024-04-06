package org.example.creditcard;



public class Account {

    public String bankName;

    public String accountNumber;

    public String accountHolderName;

    public String  ifscCode;

    public Address userAddress;

    public Address bankAddress;


    @Override
    public String toString() {
        return "Account{" +
                "bankName='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", userAddress=" + userAddress +
                ", bankAddress=" + bankAddress +
                '}';
    }
}
