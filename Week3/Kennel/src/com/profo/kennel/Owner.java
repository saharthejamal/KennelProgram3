package com.profo.kennel;

public class Owner {
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    // Constructor to initialize all properties
    public Owner(String name, String streetAddress, String city, String state) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
    }

    // Method to return the owner's name
    public String getName() {
        return name;
    }

    // Method to return the owner's address
    public String getAddress() {
        return streetAddress + ", " + city + ", " + state;
    }
}