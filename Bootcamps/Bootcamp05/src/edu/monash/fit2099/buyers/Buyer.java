package edu.monash.fit2099.buyers;

public class Buyer {

    private int buyerId;
    private String givenName;
    private String familyName;

    // Constructors
    private Buyer(int newBuyerId, String newGivenName, String newFamilyName) throws Exception {
        if (setGivenName(newGivenName) && setFamilyName(newFamilyName)) {
            this.buyerId = newBuyerId;
        }
        else {
            throw new Exception("Incorrect Length of Given Name or Family Name");
        }
    }

    public static Buyer getInstance(int newBuyerId, String newGivenName, String newFamilyName) throws Exception {
        Buyer newBuyer = new Buyer(newBuyerId, newGivenName, newFamilyName);
        return newBuyer;
    }

    private Buyer(int newBuyerId) {
        this.buyerId = newBuyerId;
    }

    public static Buyer getInstance(int newBuyerId) {
        Buyer newBuyer = new Buyer(newBuyerId);
        newBuyer.buyerId = newBuyerId;
        return newBuyer;
    }


    private Buyer() {}

    public static Buyer getInstance(String newGivenName, String newFamilyName) {
        Buyer newBuyer = new Buyer();
        if (newBuyer.setGivenName(newGivenName) && newBuyer.setFamilyName(newFamilyName)) {
            newBuyer.givenName = newGivenName;
            newBuyer.familyName = newFamilyName;
        }
        return newBuyer;
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