package org.example.creditcard;

import java.util.UUID;

public class CardService {



    public  Account createAccount(User user){

        Account account= new Account();
        Address address = new Address();
        address.area="KK road";
        address.city="Suryapet";
        address.flatNo="69";
        address.pincode="508213";

        account.accountHolderName= user.name;
        account.accountNumber= "123456";
        account.ifscCode="Sbi003";
        account.bankName="SBI";
        account.bankAddress=address;
        account.userAddress=user.address;


        return  account;

    }

    public Card createCard(Account account){
        Card card= new Card();
        card.cardHolderName= account.accountHolderName;
        card.cardNumber= "5555555555";
        card.cardExpiryDate="23/7/2024";
        card.cvv="566";
        card.avaliableBalance=50000;
        card.cardLimit=100000;


        return card;


    }

    public Loan createLoan(User user){
        Loan loan= new Loan();
        loan.loanAmount=100000;
        loan.duration="24 months";
        loan.panCard=user.panNumber;

        return  loan;
    }

    public Product purchase(Card card){
        Product product=new Product();
        product.jeans=1000;
        product.shoes=2000;
        product.watches=2000;
        product.shirts=1500;
      //  card.cardLimit=100000;
       // card.avaliableBalance=50000;

        product.cost=product.jeans+product.shirts+ product.shoes+product.watches;
        if(card.avaliableBalance<=card.cardLimit) {
            int remainingBalance =  card.avaliableBalance-product.cost ;
            int amount2 =  card.cardLimit-remainingBalance ;

            System.out.println("Total Balance in our Card : "+remainingBalance);
            System.out.println("Used amounyt in our Credit Card : "+amount2);
            System.out.println("Total purchase : "+product.cost);
        }else{
            System.out.println("Card limit existed");
            System.out.println("Total purchase : "+product.cost);
        }

        return product;
    }




}
