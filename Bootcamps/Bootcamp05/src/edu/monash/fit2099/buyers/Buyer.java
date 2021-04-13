/**
 * A Buyer Class which shows the Buyer's details
 * @author Lim Shir Yin
 * @version 11/04/2021
 */

package edu.monash.fit2099.buyers;

public class Buyer {

    private int buyerId;
    private String givenName;
    private String familyName;

    /**
     * Buyer Constructor
     * @param newBuyerId
     * @param newGivenName
     * @param newFamilyName
     * @throws Exception
     */
    private Buyer(int newBuyerId, String newGivenName, String newFamilyName)  {
        this.buyerId = newBuyerId;
        this.givenName = newGivenName;
        this.familyName = newFamilyName;
    }

    /**
     * A get instance method to get the details from Buyer class
     * @param newBuyerId
     * @param newGivenName
     * @param newFamilyName
     * @return Buyer
     */
    public static Buyer getInstance(int newBuyerId, String newGivenName, String newFamilyName) {
        Buyer newBuyer = new Buyer(newBuyerId, newGivenName, newFamilyName);
        if (newBuyer.setGivenName(newGivenName) && newBuyer.setFamilyName(newFamilyName)) {
            newBuyer.buyerId = newBuyerId;
            return newBuyer;
        }
        else {
            return null;
        }
    }

    /**
     * Buyer Constructor
     * @param newBuyerId
     */
    private Buyer(int newBuyerId) {
        this.buyerId = newBuyerId;
    }

    /**
     * A get instance method to get the details from Buyer class
     * @param newBuyerId
     * @return Buyer
     */
    public static Buyer getInstance(int newBuyerId) {
        Buyer newBuyer = new Buyer(newBuyerId);
        newBuyer.buyerId = newBuyerId;
        return newBuyer;
    }

    /**
     * Zero parameter Constructor
     */
    private Buyer() {}

    /**
     * A get instance method to get the details from Buyer class
     * @param newGivenName
     * @param newFamilyName
     * @return Buyer
     */
    public static Buyer getInstance(String newGivenName, String newFamilyName) {
        Buyer newBuyer = new Buyer();
        if (newBuyer.setGivenName(newGivenName) && newBuyer.setFamilyName(newFamilyName)) {
            newBuyer.givenName = newGivenName;
            newBuyer.familyName = newFamilyName;
            return newBuyer;
        } else {
            return null;
        }
    }

    /**
     * Setter method for Buyer's Given Name
     * @param newGivenName
     * @return boolean
     */
    public boolean setGivenName(String newGivenName) {

        boolean validGivenName = false;
        if (newGivenName.length() >= 2 && newGivenName.length() <= 15) {
            validGivenName = true;
            this.givenName = newGivenName;
        }
        return validGivenName;
    }

    /**
     * Setter method for Buyer's Family Name
     * @param newFamilyName
     * @return boolean
     */
    public boolean setFamilyName(String newFamilyName) {

        boolean validFamilyName = false;
        if (newFamilyName.length() >= 2 && newFamilyName.length() <= 15) {
            validFamilyName = true;
            this.familyName = newFamilyName;
        }
        return validFamilyName;
    }

    /**
     * Getter method for Buyer's Given Name
     * @return String
     */
    public String getGivenName() {
        return this.givenName;
    }

    /**
     * Getter method for Buyer's Family Name
     * @return String
     */
    public String getFamilyName() { return this.familyName; }

    /**
     * Getter method for Buyer's ID
     * @return int
     */
    public int getBuyerId() {
        return this.buyerId;
    }

    /**
     * To get the description of Buyer by using the getter methods
     * @return String
     */
    public String description() {
        return this.getBuyerId() + " | Name: " + this.getGivenName() + " " + this.getFamilyName();
    }
}