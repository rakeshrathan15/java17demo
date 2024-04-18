package org.example.cardemo.service;

import org.example.cardemo.Car;
import org.example.cardemo.Enginee;
import org.example.cardemo.FuelTank;
import org.example.cardemo.Wheel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CarService {

    public Car getCar(){
        Enginee enginee=new Enginee();
        enginee.horsePower="300hp";
        enginee.torque="400 lb";

        FuelTank fuelTank=new FuelTank();
        fuelTank.fuelType="disel";
        fuelTank.capacity="20 liters";

        enginee.fuelTank=fuelTank;

        Wheel wheel1= new Wheel();
        wheel1.wheelType="Alloy wheels";
        wheel1.brandName="MRF";

        Wheel wheel2= new Wheel();
        wheel2.wheelType="Alloy wheels";
        wheel2.brandName="MRF";

        Wheel wheel3= new Wheel();
        wheel3.wheelType="Alloy wheels";
        wheel3.brandName="MRF";

        Wheel wheel4= new Wheel();
        wheel4.wheelType="Alloy wheels";
        wheel4.brandName="MRF";

        Car car= new Car();
        car.enginee=enginee;
        car.fuelTank=fuelTank;

        List<Wheel>noofwheels=new ArrayList<>();
        noofwheels.add(wheel1);
        noofwheels.add(wheel2);
        noofwheels.add(wheel3);
        noofwheels.add(wheel4);



        return car;
    }




}
