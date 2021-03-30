package edu.monash.fit2099.buyers;

public class Buyer {

    private int buyerId;
    private String givenName;
    private String familyName;

    // Constructors
    public Buyer(int newBuyerId) {
        this.buyerId = newBuyerId;
    }

    public Buyer(int newBuyerId, String newGivenName, String newFamilyName) {
        this.buyerId = newBuyerId;
        this.givenName = newGivenName;
        this.familyName = newFamilyName;
    }

    // Additional comments use “givenName” and “familyName” rather than “firstName” and “lastName”
    // Using firstName and lastName might be confusing while comparing to givenName and familyName, we clearly know about what they mean.

    public void setGivenName(String newGivenName) {
        this.givenName = newGivenName;
    }

    public void setFamilyName(String newFamilyName) {
        this.familyName = newFamilyName;
    }

    public String getGivenName() {
        return this.givenName;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public int getBuyerId() {
        return this.buyerId;
    }

    // accessor method
    public String description() {
        return this.buyerId + " " + getGivenName() + " " + getFamilyName();
    }
}