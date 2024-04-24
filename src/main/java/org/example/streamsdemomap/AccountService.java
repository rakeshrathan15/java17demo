package org.example.streamsdemomap;

import java.util.*;

public class AccountService {


 //  Map<Account, Account> accountMap =new HashMap<>();

    public Map<Account,Account>  getAccount(){
        Address bankAddress=new Address();
        bankAddress.area="balaji nagar";
        bankAddress.flatNumber="25";
        bankAddress.city="Suryapet";
        bankAddress.state="TG";
        bankAddress.pincode="508212";

        Address userAddress=new Address();
        userAddress.area="kk-Road";
        userAddress.flatNumber="15";
        userAddress.city="Suryapet";
        userAddress.state="Tg";
        userAddress.pincode="508212";

        User user=new User();
        user.userName="Rakesh";
        user.userAddress=userAddress;
        user.adharCard="205123476";


        Account account=new Account();

        AccountDetails accountDetailsCredit=new AccountDetails();
        accountDetailsCredit.amount=500;
        accountDetailsCredit.transactionDate=new Date();
        accountDetailsCredit.valueDate=new Date();
        accountDetailsCredit.type="Credit";
        accountDetailsCredit.description="Phone pay";
        accountDetailsCredit.accountNumber=account.accountNumber;

        AccountDetails accountDetailsDebit=new AccountDetails();
        accountDetailsDebit.amount=50;
        accountDetailsDebit.transactionDate=new Date();
        accountDetailsDebit.valueDate=new Date();
        accountDetailsDebit.type="Debit";
        accountDetailsDebit.description="Phone pay";
       accountDetailsDebit.accountNumber= account.accountNumber;

        AccountDetails accountDetailsCredit2=new AccountDetails();
        accountDetailsCredit2.amount=100;
        accountDetailsCredit2.transactionDate=new Date();
        accountDetailsCredit2.valueDate=new Date();
        accountDetailsCredit2.type="Credit";
        accountDetailsCredit2.description="Phone pay";
        accountDetailsCredit2.accountNumber=account.accountNumber;


        List<AccountDetails> accountDetailsList=new ArrayList<>();
        accountDetailsList.add(accountDetailsCredit);
        accountDetailsList.add(accountDetailsDebit);
        accountDetailsList.add(accountDetailsCredit2);


        account.accountNumber="111111";
        account.ifscCode="SBI0012";
        account.user=user;
        account.balance=0;
        account.accountDetailsList=accountDetailsList;
        account.bankAddress=bankAddress;


        Map<Account,Account> accountMap=new HashMap<>();
        accountMap.put(account,account);

        return accountMap;


    }

}
