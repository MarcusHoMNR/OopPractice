package com.afs.oopractice;

import com.afs.oopractice.Objects.*;

public class HelloWorld {
    public static void main(String[] args) {
        // AC1
        Car car = new Car("Car", 30);
        car.speedUp();

        // AC2
        Truck truck = new Truck("Truck", 10);
        truck.speedUp();

        // AC3
        Driver carDriver = new Driver(car);
        carDriver.drive();
        Driver trucker = new Driver(truck);
        trucker.drive();

        // AC4
        Car gasolineCar = new Car("Car", new GasolineEngine());
        gasolineCar.speedUp();
        Car electricCar = new Car("Car", new ElectricEngine());
        electricCar.speedUp();
    }
}
