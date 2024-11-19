package com.profo.kennel;

public class Kennel {
    public static void main(String[] args) {
        // Create owner objects
        Owner owner1 = new Owner("Alice", "123 Park Lane", "Springfield", "IL");
        Owner owner2 = new Owner("Bob", "456 Elm Street", "Riverdale", "NY");

        // Create dog objects with owners
        Dog dog1 = new Dog("Buddy", 20.0, owner1);
        Dog dog2 = new Dog("Max", 45.0, owner1); // Same owner as dog1
        Dog dog3 = new Dog("Charlie", 55.0, owner2);

        // Display each dog's information
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        // Dogs speak
        System.out.println("Dog 1 says: " + dog1.speak());
        System.out.println("Dog 2 says: " + dog2.speak());
        System.out.println("Dog 3 says: " + dog3.speak());

        // Actions
        dog1.poop(5.0);
        dog3.eat(10.0);

        // After actions
        System.out.println("\nAfter actions:");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}