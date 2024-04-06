package org.example.Amazon;

public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        product.watches=1000;
        product.shoes=2000;
        product.jeans=3000;
        product.shirts=500;

        CardService cardService= new CardService();
       Card  card=cardService.purchase(product);
        System.out.println(card.cardLimit);
    }
}
