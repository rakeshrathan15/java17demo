package org.example.collectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateStatusDemoTest {
    public static void main(String[] args) {





       // List<Payment> paymentList = new ArrayList<>();
        Payment payment1 = new Payment();
        payment1.status="Techinacl-error";
        payment1.accountNumber="1234";
        payment1.amount=5000;

        Payment payment2 = new Payment();
        payment2.status="Completed";
        payment2.accountNumber="1234";
        payment2.amount=5000;

        Predicate<Payment> statusPredicate = (payment) ->
                payment.status.equals("Completed");

        if(statusPredicate.test(payment2)){

            System.out.println("Payment "+payment2.status);
        }else {
            System.out.println("not working");
        }







    }
}
