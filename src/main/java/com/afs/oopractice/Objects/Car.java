package com.afs.oopractice.Objects;

public class Car extends Vehicle{
    public Car(String name, int speed) {
        super(name, speed);
    }


    //Overload it for AC4
    public Car(String name, Engine engine) {
        super(name, engine.getSpeed());
    }
}
