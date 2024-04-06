package org.example.creditcard;


public class CardTest {
    public static void main(String[] args) {
        User user=new User();
        Address userAddress = new Address();
        userAddress.area="Balaji Nagar";
        userAddress.city="Srpt";
        userAddress.flatNo="34";
        userAddress.pincode="508212";

        user.name="Rakesh";
        user.address=userAddress;
        user.adharNumber="6738973";
        user.panNumber="g6749";

        CardService cardService= new CardService();
       // Card card=new Card();

        Card card= cardService.createCard(cardService.createAccount(user));
        System.out.println(card);

        Loan loan=cardService.createLoan(user);
       System.out.println(loan.loanAmount);

        System.out.println( cardService.purchase(card));













    }
}
