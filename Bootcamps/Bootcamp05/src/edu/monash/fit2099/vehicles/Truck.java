/**
 * A Truck Class
 * @author Lim Shir Yin
 * @version 11/04/2021
 * @see edu.monash.fit2099.exceptions.VehicleException
 */

package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.exceptions.VehicleException;

public class Truck extends Vehicle {

    private int capacity;  // in tons
    private int wheels;

    /**
     * A Truck Constructor with 4 parameters
     * @param newMaker
     * @param newModel
     * @param newCapacity
     * @param newWheels
     * @throws VehicleException
     */
    public Truck(String newMaker, String newModel, int newCapacity, int newWheels) throws VehicleException {
        super(newMaker, newModel);
        if (setCapacity(newCapacity) && setWheels(newWheels)) {
            this.capacity = newCapacity;
            this.wheels = newWheels;
        } else {
            throw new VehicleException("Invalid Capacity OR Number of Wheels");
        }
    }

    /**
     * A Truck Constructor with 5 parameters
     * @param newMaker
     * @param newModel
     * @param newId
     * @param newCapacity
     * @param newWheels
     * @throws VehicleException
     */
    public Truck(String newMaker, String newModel, int newId, int newCapacity, int newWheels) throws VehicleException {
        super(newMaker, newModel, newId);
        if (setCapacity(newCapacity) && setWheels(newWheels)) {
            this.capacity = newCapacity;
            this.wheels = newWheels;
        } else {
            throw new VehicleException("Invalid Capacity OR Number of Wheels");
        }
    }

    /**
     * Setter method for Capacity
     * @param newCapacity
     * @return boolean
     */
    public boolean setCapacity(int newCapacity) {

        boolean validCapacity = false;
        if (newCapacity >= 1 && newCapacity <= 15) {
            validCapacity = true;
            this.capacity = newCapacity;
        }
        return validCapacity;
    }

    /**
     * Setter method for Wheels
     * @param newWheels
     * @return boolean
     */
    public boolean setWheels(int newWheels) {

        boolean validWheels = false;
        if (newWheels >= 4 && newWheels <= 16) {
            validWheels = true;
            this.wheels = newWheels;
        }
        return validWheels;
    }

    /**
     * Getter method for Capacity
     * @return int
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Getter method for Wheels
     * @return int
     */
    public int getWheels() {
        return this.wheels;
    }
}
