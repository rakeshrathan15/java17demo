package org.example.Swiggy;

import java.util.List;

public class Restaurant {

        public List<Dish> dishList;

        public String restaurantName;

        public double restaurantRating;


        public Address address;


        @Override
        public boolean equals(Object obj){
            if(this==obj){
                return true;
            }if(this.getClass()!=obj.getClass()){
                return false;

            }
            Restaurant restaurant=(Restaurant) obj;
            return  this.restaurantName.equals(restaurant.restaurantName);
        }
        public int hashCode() {
            return this.restaurantName.hashCode();
        }
    }


