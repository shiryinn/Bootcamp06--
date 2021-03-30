package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.bids.Bid;
import edu.monash.fit2099.buyers.Buyer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

abstract public class Vehicle {

    private String carMaker;
    private String carModel;
    private int vId;
    private ArrayList<Bid> bids = new ArrayList<>();
    private int bidIdCount = 0;

    // unsure
    public Vehicle(String newMaker, String newModel) {
        this.carMaker = newMaker;
        this.carModel = newModel;
        Random random = new Random();
        int low = this.vId;
        int high = 99999;
        int randomId = random.nextInt(high - low) + low;
    }

    public Vehicle(String newMaker, String newModel, int newId) {
        this.carMaker = newMaker;
        this.carModel = newModel;
        this.vId = newId;
    }

    public String getCarMaker() {
        return this.carMaker;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public String description() {
        // Task 3
        //String carDescription = getCarMaker() + getCarModel();
        // Task 4
        String carDescription = "Maker:" + getCarMaker() + " and Model:" + getCarModel();
        return carDescription;
    }

    public ArrayList<Bid> getBids() { return this.bids; }

    public void addBid(Buyer newBuyer, double price, Date date) {
        this.bidIdCount++;
        Bid newBid = new Bid(bidIdCount, newBuyer, price, date);
        bids.add(newBid);
    }
}
