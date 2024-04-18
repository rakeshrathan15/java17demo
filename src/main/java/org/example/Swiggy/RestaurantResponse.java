package org.example.Swiggy;

import java.util.List;

public class RestaurantResponse {
    List<Restaurant> restaurantList;

   public Restaurant  selectRestaurant(SwiggyService swiggyService, String restaurantName ){

       for(Restaurant restaurant: swiggyService.restaurantList){
           if(restaurant.restaurantName.equals(restaurantName)){
               return restaurant;
           }

       }

 return null;
 }

 public Dish selectDish(Restaurant restaurant,String dishName){
       for (Dish dish:restaurant.dishList){
           if(dish.dishName.equals(dishName)){
               return dish;

           }
       }
       return null;
 }







}
