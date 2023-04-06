package org.example;

class Car extends Vehicle {
    private int numDoors;
    private String color;
    public Car(String make, String model, int numDoors, String color) {
        super(make, model);
        this.numDoors = numDoors;
        this.color = color;
    }
    public void lockDoors() {
        System.out.println("Doors locked");
    }
    public void unlockDoors() {
        System.out.println("Doors unlocked");
    }
    public String toString() {
        return super.toString() + " Car [numDoors=" + numDoors + ", color=" + color + "]";
    }
    public void drive() {
        System.out.println("Driving car");
    }
    public void stop() {
        System.out.println("Stopping car");
    }
}