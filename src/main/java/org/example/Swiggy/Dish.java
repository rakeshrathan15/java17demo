package org.example.Swiggy;

public class Dish {



     public String dishName;
     public String type;


     public double price;

     @Override
     public String toString() {
          return "Dish{" +
                  "dishName='" + dishName + '\'' +
                  ", type='" + type + '\'' +
                  ", price=" + price +
                  '}';
     }
}
