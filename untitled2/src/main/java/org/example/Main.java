package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 4, "Red");
        Vehicle motorcycle = new Motorcycle("Harley Davidson", "Sportster", false, 2);
        Vehicle truck = new Truck("Ford", "F-150", 1000, 2);
        System.out.println(car.getMakeAndModel());
        car.drive();
        car.stop();
        ((Car) car).lockDoors();
        ((Car) car).unlockDoors();
        System.out.println(motorcycle.getMakeAndModel());

    }
}