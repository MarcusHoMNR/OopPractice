package com.afs.oopractice.Objects;

public class Truck {
    private final String name;
    private final int speed;

    public Truck(String name, int speed) {
        this.speed = speed;
        this.name = name;
    }

    public void speedUp() {
        System.out.println(this.name + ": speed up " + this.speed + " km/h");
    }
}
