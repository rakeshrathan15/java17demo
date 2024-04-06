package org.example.Amazon;

public class CardService {

    public Card purchase(Product product){
        Card card= new Card();
        card.CardHolderName="Rakesh";
        card.cardLimit=50000;

        card.cardNumber="777777";
        card.cvv="123";

        product.cost=product.jeans+ product.shoes+product.watches;

        int amount= card.cardLimit- product.cost;


        System.out.println(amount);
        return card;
    }



}
