package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.bids.BidsManager;
import edu.monash.fit2099.exceptions.VehicleException;

import java.util.Random;

abstract public class Vehicle {

    private String carMaker;
    private String carModel;
    private int vId;
    private BidsManager manageBids = new BidsManager();

    public Vehicle(String newMaker, String newModel) throws VehicleException {

        if (setCarMaker(newMaker) && setCarModel(newModel)) {
            this.vId = randomId();
        } else {
            throw new VehicleException("Incorrect Car Maker OR Car Model");
        }
    }

    public Vehicle(String newMaker, String newModel, int newId) throws VehicleException{

        if (setCarMaker(newMaker) && setCarModel(newModel)) {
            this.vId = newId;
        } else {
            throw new VehicleException("Incorrect Car Maker OR Car Model");
        }
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

    public boolean setCarMaker(String newCarMaker) {

        boolean validCarMaker = false;
        if (newCarMaker.length() >= 3 && newCarMaker.length() <= 15) {
            validCarMaker = true;
            this.carMaker = newCarMaker;
        }
        return validCarMaker;
    }

    public boolean setCarModel(String newCarModel) {

        boolean validCarMaker = false;
        if (newCarModel.length() >= 3 && newCarModel.length() <= 15) {
            validCarMaker = true;
            this.carModel = newCarModel;
        }
        return validCarMaker;
    }

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