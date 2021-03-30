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
}
