package org.example.streamsdemomap;

public class Address {

    public String area;
    public String flatNumber;

    public String city;

    public String state;

    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
