package org.example.streamsdemomap;

public class User {
    public String userName;
    public Address userAddress;

    public String adharCard;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAddress=" + userAddress +
                ", adharCard='" + adharCard + '\'' +
                '}';
    }
}
