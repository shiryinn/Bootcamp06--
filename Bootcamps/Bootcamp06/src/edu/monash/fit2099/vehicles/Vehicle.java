/**
 * An Abstract Vehicle Class
 * @author Lim Shir Yin
 * @version 11/04/2021
 * @see edu.monash.fit2099.bids.BidsManager
 * @see edu.monash.fit2099.exceptions.VehicleException
 */

package edu.monash.fit2099.vehicles;

import edu.monash.fit2099.bids.BidsManager;
import edu.monash.fit2099.exceptions.VehicleException;

import java.util.Random;

abstract public class Vehicle {

    private String carMaker;
    private String carModel;
    private int vId;
    private BidsManager manageBids = new BidsManager();

    /**
     * Vehicle Constructor with 2 parameters
     * @param newMaker
     * @param newModel
     * @throws VehicleException
     */
    public Vehicle(String newMaker, String newModel) throws VehicleException {

        if (setCarMaker(newMaker) && setCarModel(newModel)) {
            this.vId = randomId();
        } else {
            throw new VehicleException("Incorrect Car Maker OR Car Model");
        }
    }

    /**
     * Vehicle Constructor with 3 parameters
     * @param newMaker
     * @param newModel
     * @param newId
     * @throws VehicleException
     */
    public Vehicle(String newMaker, String newModel, int newId) throws VehicleException{

        if (setCarMaker(newMaker) && setCarModel(newModel)) {
            this.vId = newId;
        } else {
            throw new VehicleException("Incorrect Car Maker OR Car Model");
        }
    }

    /**
     * To generate random ID
     * @return int
     */
    private static int randomId(){
        Random random = new Random();
        int low = 1;
        int high = 99999;
        int randomId = random.nextInt(high - low) + low;
        return randomId;
    }

    /**
     * To get Vehicle's ID (getter method)
     * @return int
     */
    public int getVId() { return this.vId; }

    /**
     * To set Car Maker (setter method)
     * @param newCarMaker
     * @return boolean
     */
    public boolean setCarMaker(String newCarMaker) {

        boolean validCarMaker = false;
        if (newCarMaker.length() >= 3 && newCarMaker.length() <= 15) {
            validCarMaker = true;
            this.carMaker = newCarMaker;
        }
        return validCarMaker;
    }

    /**
     * To set Car Model (setter method)
     * @param newCarModel
     * @return boolean
     */
    public boolean setCarModel(String newCarModel) {

        boolean validCarMaker = false;
        if (newCarModel.length() >= 3 && newCarModel.length() <= 15) {
            validCarMaker = true;
            this.carModel = newCarModel;
        }
        return validCarMaker;
    }

    /**
     * To get Vehicle's Maker (getter method)
     * @return String
     */
    public String getCarMaker() {
        return this.carMaker;
    }

    /**
     * To get Vehicle's Model (getter method)
     * @return String
     */
    public String getCarModel() {
        return this.carModel;
    }

    /**
     * To get the object called from BidsManager class
     * @return BidsManager
     */
    public BidsManager getManageBids() { return this.manageBids; }

    /**
     * To return the description of the Vehicle by using getter method
     * @return String
     */
    public String description() {
        String desc = "ID: " + getVId() + " | Maker: " + getCarMaker() + " | Model: " + getCarModel();
        return desc;
    }
}