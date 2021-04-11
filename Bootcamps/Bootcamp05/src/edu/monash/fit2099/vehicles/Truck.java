package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.exceptions.VehicleException;

public class Truck extends Vehicle {

    private int capacity;  // in tons
    private int wheels;

    public Truck(String newMaker, String newModel, int newCapacity, int newWheels) throws VehicleException {
        super(newMaker, newModel);
        if (setCapacity(newCapacity) && setWheels(newWheels)) {
            this.capacity = newCapacity;
            this.wheels = newWheels;
        } else {
            throw new VehicleException("Invalid Capacity OR Number of Wheels");
        }
    }

    public Truck(String newMaker, String newModel, int newId, int newCapacity, int newWheels) throws VehicleException {
        super(newMaker, newModel, newId);
        if (setCapacity(newCapacity) && setWheels(newWheels)) {
            this.capacity = newCapacity;
            this.wheels = newWheels;
        } else {
            throw new VehicleException("Invalid Capacity OR Number of Wheels");
        }
    }

    public boolean setCapacity(int newCapacity) {

        boolean validCapacity = false;
        if (newCapacity >= 1 && newCapacity <= 15) {
            validCapacity = true;
            this.capacity = newCapacity;
        }
        return validCapacity;
    }

    public boolean setWheels(int newWheels) {

        boolean validWheels = false;
        if (newWheels >= 4 && newWheels <= 16) {
            validWheels = true;
            this.wheels = newWheels;
        }
        return validWheels;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWheels() {
        return this.wheels;
    }
}
