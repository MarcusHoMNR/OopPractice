package com.afs.oopractice.Objects;

public class Driver {
    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void drive() {
        this.vehicle.speedUp();
    }
}
