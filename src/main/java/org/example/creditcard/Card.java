package org.example.creditcard;

public class Card {

    public String cardNumber;
    public String cardHolderName;

    public   String cvv;
    public String cardExpiryDate;

    public int avaliableBalance;

    public int cardLimit;



    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cvv='" + cvv + '\'' +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                '}';
    }
}
