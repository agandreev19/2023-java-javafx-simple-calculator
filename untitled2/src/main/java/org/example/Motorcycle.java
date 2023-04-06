package org.example;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int numWheels;
    public Motorcycle(String make, String model, boolean hasSidecar, int numWheels) {
        super(make, model);
        this.hasSidecar = hasSidecar;
        this.numWheels = numWheels;
    }
    public void leanLeft() {
        System.out.println("Leaning left");
    }
    public void leanRight() {
        System.out.println("Leaning right");
    }
    public String toString() {
        return super.toString() + " Motorcycle [hasSidecar=" + hasSidecar + ", numWheels=" + numWheels + "]";
    }
    public void drive() {
        System.out.println("Driving motorcycle");
    }
    public void stop() {
        System.out.println("Stopping motorcycle");
    }
}