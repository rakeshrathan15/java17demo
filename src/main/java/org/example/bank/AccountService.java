package org.example.bank;

import java.util.UUID;

public class AccountService {

public PassBook createAccount(User user){
    PassBook passBook = new PassBook();
    Address address= new Address();
    address.area="balaji nagar";
    address.village="srpt";
    address.state="TS";
    address.pincode="508212";


    String name= user.firstName+ " "+user.lastName;

    passBook.accountHolderName=name;
    passBook.userAddress=user.address;
    passBook.bankAddress=address;
    passBook.accountNumber= UUID.randomUUID().toString();
    passBook.ifscCode="SBI0023";


    return passBook;
}
}
