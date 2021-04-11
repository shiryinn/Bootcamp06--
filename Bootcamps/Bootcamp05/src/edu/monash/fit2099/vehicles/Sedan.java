package edu.monash.fit2099.vehicles;

public class Sedan extends Vehicle {

    private int seats;   // number of seats

    // constructors
    public Sedan(String newMaker, String newModel, int newSeats) {
        super(newMaker, newModel);
        this.seats = newSeats;
    }

    public Sedan(String newMaker, String newModel, int newId, int newSeats) {
        super(newMaker, newModel, newId);
        this.seats = newSeats;
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
