package org.example.Swiggy;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {
   List<Restaurant> restaurantList;



    public List<Restaurant> getRestaurant(){
        Restaurant restaurant1= new Restaurant();



        Address address=new Address();
        address.area="Dlf";
        address.flatNo="12";
        address.city="Hyd";
        address.state="TG";
        address.pincode="508212";

        Dish dish = new Dish();
        dish.dishName ="fish";
        dish.type="non veg";
        dish.price=200;

        Dish dish1= new Dish();
        dish1.dishName="chicken Briyani";
        dish1.type="non veg";
        dish1.price=300;

        List<Dish>dishList = new ArrayList<>();
        dishList.add(dish1);
        dishList.add(dish);
        restaurant1.dishList=dishList;

        restaurant1.restaurantName="Mefhil";
        restaurant1.restaurantRating=4.0;









        Restaurant restaurant2= new Restaurant();

        Address address2=new Address();
        address2.area="Hitec city";
        address2.flatNo="77";
        address2.city="Hyd";
        address2.state="TG";
        address2.pincode="508999";

        restaurant2.restaurantName="Bhar Cafe";
        restaurant2.restaurantRating=5.0;
        restaurant2.address=address2;

        Dish dish2=new Dish();
        dish2.type="non veg";
        dish2.price=150;
        dish2.dishName="Mutton briyani";

        Dish dish3=new Dish();
        dish3.type="veg";
        dish3.dishName="veg meals";
        dish3.price=100;

        List<Dish>dishList1 = new ArrayList<>();
        dishList1.add(dish2);
        dishList1.add(dish3);


        List<Restaurant> restaurantList= new ArrayList<>();
        restaurantList.add(restaurant1);

        restaurantList.add(restaurant2);



        return  restaurantList;
    }

}
