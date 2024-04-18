package org.example.cardemo;

import org.example.cardemo.service.CarService;

public class Test {
    public static void main(String[] args) {
        CarService carService=new CarService();
        System.out.println(carService.getCar());
    }
}
