package com.afs.oopractice;

import com.afs.oopractice.Objects.Car;
import com.afs.oopractice.Objects.Driver;
import com.afs.oopractice.Objects.Truck;

public class HelloWorld {
    public static void main(String[] args) {
        Car car = new Car("Car", 30);
        car.speedUp();
        Truck truck = new Truck("Truck", 10);
        truck.speedUp();

        Driver carDriver = new Driver(car);
        carDriver.drive();

        Driver trucker = new Driver(truck);
        trucker.drive();
    }
}
