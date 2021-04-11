package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.exceptions.VehicleException;

public class Sedan extends Vehicle {

    private int seats;   // number of seats

    // constructors
    public Sedan(String newMaker, String newModel, int newSeats) throws VehicleException {
        super(newMaker, newModel);
        if (setSeats(newSeats)) {
            this.seats = newSeats;
        } else {
            throw new VehicleException("Invalid Number of Seats");
        }
    }

    public Sedan(String newMaker, String newModel, int newId, int newSeats) throws VehicleException {
        super(newMaker, newModel, newId);
        if (setSeats(newSeats)) {
            this.seats = newSeats;
        } else {
            throw new VehicleException("Invalid Number of Seats");
        }
    }

    public boolean setSeats(int newSeats) {

        boolean validNoSeats = false;
        if (newSeats >= 4 && newSeats <= 5) {
            validNoSeats = true;
            this.seats = newSeats;
        }
        return validNoSeats;
    }

    public int getSeats() {
        return this.seats;
    }
}
