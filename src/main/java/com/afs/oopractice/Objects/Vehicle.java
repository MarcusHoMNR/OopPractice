package com.afs.oopractice.Objects;

public abstract class Vehicle {
    private final String name;
    private final int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        System.out.println(this.name + ": speed up " + this.speed + " km/h");
    }
}
