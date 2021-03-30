package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.bids.Bid;
import edu.monash.fit2099.bids.BidsManager;
import edu.monash.fit2099.buyers.Buyer;

import java.util.Random;

abstract public class Vehicle {

    private String carMaker;
    private String carModel;
    private int vId;
    private BidsManager manageBids = new BidsManager();

    public Vehicle(String newMaker, String newModel) {
        this.carMaker = newMaker;
        this.carModel = newModel;
        this.vId = randomId();
    }

    public Vehicle(String newMaker, String newModel, int newId) {
        this.carMaker = newMaker;
        this.carModel = newModel;
        this.vId = newId;
    }

    // generate random Id
    private static int randomId(){
        Random random = new Random();
        int low = 1;
        int high = 99999;
        int randomId = random.nextInt(high - low) + low;
        return randomId;
    }

    public int getVId() { return this.vId; }

    public String getCarMaker() {
        return this.carMaker;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public BidsManager getManageBids() { return this.manageBids; }

    public String description() {
        String desc = "ID: " + getVId() + " | Maker: " + getCarMaker() + " | Model: " + getCarModel();
        return desc;
    }
}