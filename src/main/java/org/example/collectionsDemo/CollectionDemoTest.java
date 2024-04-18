package org.example.collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class CollectionDemoTest {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> listSizePredicate = (index,size)-> index < size;
        Predicate<String> byName=(name) -> name.equals("mefhil mandi");

        Restaurant restaurant1 =new Restaurant();
        restaurant1.restaurantName="mefhil mandi";

        Restaurant restaurant2 =new Restaurant();
        restaurant2.restaurantName="bhawarchi";

        Restaurant restaurant3 =new Restaurant();
        restaurant3.restaurantName="mefhil mandi";


        List<Restaurant> list=new ArrayList<>();
        list.add(restaurant1);
        list.add(restaurant2);
        list.add(restaurant3);


        for (int i=0;listSizePredicate.test(i,list.size());i++){
            Restaurant restaurant=list.get(i);
            System.out.println("Restaurent name "+ restaurant.restaurantName);


        }
        for(int i=0;i<list.size();i++) {
            Restaurant restaurant=list.get(i);
            while (byName.test(restaurant.restaurantName)) {
                System.out.println("Restaurent name from string " + restaurant.restaurantName);
                break;
            }
        }
        Iterator<Restaurant> iterator = list.iterator();
        for (;iterator.hasNext();){
           Restaurant restaurant=iterator.next();
          //  System.out.println("Iterator Restaurent Name "+restaurant.restaurantName);
            System.out.println(restaurant.restaurantName);
        }
      //  list.forEach(restaurant -> System.out.println("Consumer "+restaurant.restaurantName)
       // );


    }
}
