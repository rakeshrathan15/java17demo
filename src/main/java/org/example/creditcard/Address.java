package org.example.creditcard;

public class Address {

    public String area;
    public String city;
    public String flatNo;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
