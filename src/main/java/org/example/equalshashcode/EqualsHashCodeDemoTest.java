package org.example.equalshashcode;

public class EqualsHashCodeDemoTest {
    public static void main(String[] args) {
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

     //   System.out.println(address1.equals(address2));
     //   System.out.println(address2.equals(address1));
     //   System.out.println(address1.hashCode());
     //   System.out.println(address2.hashCode());

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
