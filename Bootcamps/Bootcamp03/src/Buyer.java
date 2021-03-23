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

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    // accessor method
    public String description() {
        String buyerDesc = "Buyer ID: " + buyerId + " Buyer Name: " + getGivenName() + getFamilyName();
        return buyerDesc;
    }
}