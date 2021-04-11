package edu.monash.fit2099.buyers;

public class Buyer {

    private int buyerId;
    private String givenName;
    private String familyName;

    // Constructors
    public Buyer(int newBuyerId, String newGivenName, String newFamilyName) {
        this.buyerId = newBuyerId;
        this.givenName = newGivenName;
        this.familyName = newFamilyName;
    }

    public Buyer(int newBuyerId) {
        this.buyerId = newBuyerId;
    }

    public boolean setGivenName(String newGivenName) {

        boolean validGivenName = false;
        if (newGivenName.length() >= 2 && newGivenName.length() <= 15) {
            validGivenName = true;
            this.givenName = newGivenName;
        }
        return validGivenName;
    }

    public boolean setFamilyName(String newFamilyName) {

        boolean validFamilyName = false;
        if (newFamilyName.length() >= 2 && newFamilyName.length() <= 15) {
            validFamilyName = true;
            this.familyName = newFamilyName;
        }
        return validFamilyName;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public String getFamilyName() { return this.familyName; }

    public int getBuyerId() {
        return this.buyerId;
    }

    public String description() {
        return this.getBuyerId() + " | Name: " + this.getGivenName() + " " + this.getFamilyName();
    }
}