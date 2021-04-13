/**
 * A Sedan Class
 * @author Lim Shir Yin
 * @version 11/04/2021
 * @see edu.monash.fit2099.exceptions.VehicleException
 * @see edu.monash.fit2099.exceptions.SedanException
 */

package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.exceptions.SedanException;
import edu.monash.fit2099.exceptions.VehicleException;

public class Sedan extends Vehicle {

    private int seats;   // number of seats

    /**
     * Sedan Constructor with 3 parameters
     * @param newMaker
     * @param newModel
     * @param newSeats
     * @throws VehicleException
     */
    public Sedan(String newMaker, String newModel, int newSeats) throws VehicleException {
        super(newMaker, newModel);
        if (setSeats(newSeats)) {
            this.seats = newSeats;
        } else {
            throw new SedanException("Invalid Number of Seats");
        }
    }

    /**
     * Sedan Constructor with 4 parameters
     * @param newMaker
     * @param newModel
     * @param newId
     * @param newSeats
     * @throws VehicleException
     */
    public Sedan(String newMaker, String newModel, int newId, int newSeats) throws VehicleException {
        super(newMaker, newModel, newId);
        if (setSeats(newSeats)) {
            this.seats = newSeats;
        } else {
            throw new SedanException("Invalid Number of Seats");
        }
    }

    /**
     * Setter method for Seats
     * @param newSeats
     * @return boolean
     */
    public boolean setSeats(int newSeats) {

        boolean validNoSeats = false;
        if (newSeats >= 4 && newSeats <= 5) {
            validNoSeats = true;
            this.seats = newSeats;
        }
        return validNoSeats;
    }

    /**
     * Getter method for Seats
     * @return int
     */
    public int getSeats() {
        return this.seats;
    }
}
