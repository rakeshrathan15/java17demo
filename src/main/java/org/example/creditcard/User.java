package org.example.creditcard;

public class User {

    public String name;
    public String phoneNumber;

    public String adharNumber;
    public String panNumber;

    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adharNumber='" + adharNumber + '\'' +
                ", panNumber='" + panNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
