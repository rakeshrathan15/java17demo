package org.example.Swiggy;



import java.util.List;
import java.util.Scanner;

public class SwiggyTest {
    public static void main(String[] args) {

SwiggyService swiggyService = new SwiggyService();
      List<Restaurant> restaurantList= swiggyService.getRestaurant();

 //       System.out.println(restaurantList);

//      Scanner input= new Scanner(System.in);
//
//     System.out.print("Enter your Restaurant :");
//
//     String name=input.nextLine();
//     System.out.println("Restaurant name: "+name);
//
//        System.out.print("Enter your Dish Name :");
//        String name1=input.nextLine();
//
//        System.out.println("Dish name: "+name1);

        Address address1=new Address();
        address1.area="kphp";
        address1.flatNo="132";
        address1.state="ts";
        address1.pincode="508212";
        address1.city="hyd";


        Address address2=new Address();
        address2.area="kphp";
        address2.flatNo="132";
        address2.state="ts";
        address2.pincode="508212";
        address2.city="hyd";


      System.out.println("----------------------------------------");
        System.out.println("symmetric Test Starts here");

        System.out.println(address1.equals(address2));
        System.out.println(address2.equals(address1));
        System.out.println("address1 = "+address1.hashCode());
        System.out.println("address2 = "+address2.hashCode());
        System.out.println("symmetric Ends Here");
        System.out.println("-------------------------------------");

      System.out.println("reflexive Test Starts here");
      System.out.println(address1.equals(address1));

      System.out.println("reflexive Test End here");
      System.out.println("------------------------------------");

      System.out.println("Transitive Test Start here");
      System.out.println();






    }





}
