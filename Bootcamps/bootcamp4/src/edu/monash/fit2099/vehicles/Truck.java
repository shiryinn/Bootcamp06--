package edu.monash.fit2099.vehicles;

public class Truck extends Vehicle {

    private int capacity;  // in tons
    private int wheels;

    public Truck(String newMaker, String newModel, int newCapacity, int newWheels) {
        super(newMaker, newModel);
        this.capacity = newCapacity;
        this.wheels = newWheels;
    }

    public Truck(String newMaker, String newModel, int newId, int newCapacity, int newWheels) {
        super(newMaker, newModel, newId);
        this.capacity = newCapacity;
        this.wheels = newWheels;
    }
}
