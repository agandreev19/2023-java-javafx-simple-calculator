package org.example;

class Truck extends Vehicle {
    private int payloadCapacity;
    private int numAxles;
    public Truck(String make, String model, int payloadCapacity, int numAxles) {
        super(make, model);
        this.payloadCapacity = payloadCapacity;
        this.numAxles = numAxles;
    }
    public void load() {
        System.out.println("Loading truck");
    }
    public void unload() {
        System.out.println("Unloading truck");
    }
    public String toString() {
        return super.toString() + " Truck [payloadCapacity=" + payloadCapacity + ", numAxles=" + numAxles + "]";
    }
    public void drive() {
        System.out.println("Driving truck");
    }
    public void stop() {
        System.out.println("Stopping truck");
    }
}