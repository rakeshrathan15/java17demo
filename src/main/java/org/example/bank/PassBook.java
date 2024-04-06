package org.example.bank;

public class PassBook {

    public String accountHolderName;

    public  String accountNumber;

    public String ifscCode;

    public Address userAddress;

    public Address bankAddress;

    @Override
    public String toString() {
        return "PassBook{" +
                "accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", userAddress=" + userAddress +
                ", bankAddress=" + bankAddress +
                '}';
    }
}
