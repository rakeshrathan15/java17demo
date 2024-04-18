package org.example.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SetDemoTest {
    public static void main(String[] args) {
        Set<Car> carSet=new HashSet<>();
        Car car1=new Car();
        car1.name="Punch";

        Car car2=new Car();
        car2.name="Punch";
        carSet.add(car1);
        carSet.add(car2);

        System.out.println(carSet);

        Address address1=new Address();
        address1.area="kphp";
        address1.flatNo="132";
        address1.pinCode="508212";
        address1.state="ts";
        address1.street="balaji nagar";

        Address address2=new Address();
        address2.area="kphp";
        address2.flatNo="132";
        address2.pinCode="508212";
        address2.state="ts";
        address2.street="balaji nagar";


       Set<Address> addressSet=new HashSet<>();
       addressSet.add(address1);
        addressSet.add(address2);
        System.out.println(addressSet);
    }
}
