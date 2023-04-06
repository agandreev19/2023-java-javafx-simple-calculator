package org.example;

abstract class Vehicle {
    private String make;
    private String model;
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public abstract void drive();
    public abstract void stop();
    public String getMakeAndModel() {
        return make + " " + model;
    }
    public String toString() {
        return "Vehicle [make=" + make + ", model=" + model + "]";
    }
}