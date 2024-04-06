package org.example.bank;

public class AccountCreationTest {


    public static void main(String[] args) {
        User  user = new User();
        Address userAddress= new Address();

        userAddress.area="KK Road";
        userAddress.state="TS";
        userAddress.village="HYD";
        userAddress.pincode="508243";


        user.lastName="Mekala";
        user.firstName="Rakesh";
        user.adharCard="12349987 ";
        user.panCard="7738";
        user.phoneNumber="7013776567";
        user.address= userAddress;

        AccountService accountService= new AccountService();
       PassBook passBook = accountService.createAccount(user );

        System.out.println(passBook.accountNumber);

        



    }
}
