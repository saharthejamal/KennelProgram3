package com.profo.kennel;

public class Dog {
    private String name;
    private double weight;
    private Owner owner; // Replacing the String owner and address properties with an Owner object

    // Constructor to initialize properties
    public Dog(String name, double weight, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
    }

    // Poop method
    public void poop(double amount) {
        weight -= amount;
    }

    // Eat method
    public void eat(double amount) {
        weight += amount;
    }

    // Speak method
    public String speak() {
        if (weight < 25) {
            return "Yip yip!";
        } else if (weight <= 50) {
            return "Bark!";
        } else {
            return "Woof!";
        }
    }

    // Method to return the dog's owner's name
    public String getOwnerName() {
        return owner.getName();
    }

    // toString method
    @Override
    public String toString() {
        return "Dog's name: " + name + ", Owner's Address: " + owner.getAddress();
    }
}