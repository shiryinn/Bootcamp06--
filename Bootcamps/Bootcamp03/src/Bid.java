import java.util.Date;

public class Bid {

    private int bidId;
    // instance of buyer class
    private Buyer buyer;
    private double bidPrice;
    private Date bidDate;

    // Constructor
    public Bid(int newBidId, Buyer newBuyer, double newBidPrice, Date newBidDate){
        this.bidId = newBidId;
        this.buyer = newBuyer;
        this.bidPrice = newBidPrice;
        this.bidDate = newBidDate;
    }

    public void setBidId(int newBidId){
        this.bidId = newBidId;
    }

    public void setBuyer(int newBuyerId, String buyerGivName, String buyerFamName) {
        this.buyer = new Buyer(newBuyerId, buyerGivName, buyerFamName);
    }

    public void setBidPrice(double newBidPrice) {
        this.bidPrice = newBidPrice;
    }

    public void setBidDate(Date newBidDate) {
        this.bidDate = newBidDate;
    }

    public int getBidId() {
        return this.bidId;
    }

    public Buyer getBuyer() {
        return this.buyer;
    }

    public double getBidPrice() {
        return this.bidPrice;
    }

    public Date getBidDate() {
        return this.bidDate;
    }
}