package org.example.streamsdemomap;

import java.util.List;
import java.util.Objects;

public class Account {



   public String  accountNumber;

   public double  balance;

   public String ifscCode;

   public Address bankAddress;


   public User user;

   List<AccountDetails> accountDetailsList;

   @Override
    public boolean equals(Object obj){
       if(this==obj){
           return  true;

       }if(this.getClass()!=obj.getClass()){
           return false;
       }
       Account bankAccount = (Account) obj;
       return this.accountNumber.equals(bankAccount.accountNumber);
   }

   @Override
    public int hashCode(){
       return accountNumber.hashCode();
   }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", ifscCode='" + ifscCode + '\'' +
                ", bankAddress=" + bankAddress +
                ", user=" + user +
                ", accountDetailsList=" + accountDetailsList +
                '}';
    }
}
