/**
 * Bid Class
 * @author Lim Shir Yin
 * @version 11/04/2021
 * @see Bid, setBidDate, setBidPrice
 */

package edu.monash.fit2099.bids;

import edu.monash.fit2099.buyers.Buyer;
import edu.monash.fit2099.exceptions.BidException;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bid {

    private int bidId;
    // instance of buyer class
    private Buyer buyer;
    private double bidPrice;
    private Date bidDate;

    // Constructor
    public Bid(int newBidId, Buyer newBuyer, double newBidPrice, Date newBidDate) throws BidException, ParseException {

        if (setBidPrice(newBidPrice) && setBidDate(newBidDate)) {
            this.bidId = newBidId;
            this.buyer = newBuyer;
        } else {
            throw new BidException("Invalid Bid Price OR Bid Date");
        }
    }

    public void setBidId(int newBidId){
        this.bidId = newBidId;
    }

    public void setBuyer(int newBuyerId, String buyerGivName, String buyerFamName) throws Exception {
        this.buyer = Buyer.getInstance(newBuyerId, buyerGivName, buyerFamName);
    }

    public boolean setBidPrice(double newBidPrice) {

        boolean validPrice = false;
        // minimum value is 0
        if (newBidPrice >= 0) {
            validPrice = true;
            this.bidPrice = newBidPrice;
        }
        return validPrice;
    }

    public boolean setBidDate(Date newBidDate) throws ParseException {

        boolean validDate = false;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        final String start = "01/01/1930";
        final String end = "31/12/2021";
        Date startDate = formatter.parse(start);
        Date endDate = formatter.parse(end);
        // check format is correct
        if (newBidDate.before(endDate) && newBidDate.after(startDate)) {
            validDate = true;
            this.bidDate = newBidDate;
        }
        return validDate;
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

    public String bidsDescription(){
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        String bidDate = formatter.format(this.getBidDate());
        return " Bid " + this.getBidId() + ": \n Buyer ID: " + this.getBuyer().getBuyerId()
                + "\n Bid Price: $" + String.format("%.2f", this.getBidPrice())
                + "\n Bid Date: " + bidDate;
    }
}