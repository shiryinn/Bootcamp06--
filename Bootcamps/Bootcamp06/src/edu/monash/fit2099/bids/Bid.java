/**
 * A Bid Class which contains the details of bids added
 * @author Lim Shir Yin
 * @version 11/04/2021
 * @see edu.monash.fit2099.buyers.Buyer
 * @see edu.monash.fit2099.exceptions.BidException
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

    /**
     * A Bid Constructor
     * @param newBidId
     * @param newBuyer
     * @param newBidPrice
     * @param newBidDate
     * @throws BidException
     * @throws ParseException
     */
    public Bid(int newBidId, Buyer newBuyer, double newBidPrice, Date newBidDate) throws BidException, ParseException {

        if (setBidPrice(newBidPrice) && setBidDate(newBidDate)) {
            this.bidId = newBidId;
            this.buyer = newBuyer;
        } else {
            throw new BidException("Invalid Bid Price OR Bid Date");
        }
    }

    /**
     * Setter method for Bid's ID
     * @param newBidId
     */
    public void setBidId(int newBidId){
        this.bidId = newBidId;
    }

    /**
     * Setter method for Buyer
     * @param newBuyerId
     * @param buyerGivName
     * @param buyerFamName
     * @throws Exception
     */
    public void setBuyer(int newBuyerId, String buyerGivName, String buyerFamName) throws Exception {
        this.buyer = Buyer.getInstance(newBuyerId, buyerGivName, buyerFamName);
    }

    /**
     * Setter method for Bid's Price
     * @param newBidPrice
     * @return boolean
     */
    public boolean setBidPrice(double newBidPrice) {

        boolean validPrice = false;
        // minimum value is 0
        if (newBidPrice >= 0) {
            validPrice = true;
            this.bidPrice = newBidPrice;
        }
        return validPrice;
    }

    /**
     * Setter method for Bid's Date
     * @param newBidDate
     * @return boolean
     * @throws ParseException
     */
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

    /**
     * Getter method for Bid's ID
     * @return int
     */
    public int getBidId() {
        return this.bidId;
    }

    /**
     * Getter method for Buyer instance
     * @return Buyer
     */
    public Buyer getBuyer() {
        return this.buyer;
    }

    /**
     * Getter method for Bid's Price
     * @return double
     */
    public double getBidPrice() {
        return this.bidPrice;
    }

    /**
     * Getter method for Bid's Date
     * @return Date
     */
    public Date getBidDate() {
        return this.bidDate;
    }

    /**
     * A bidsDescription method to show the details of the bids using getter methods
     * @return String
     */
    public String bidsDescription(){
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        String bidDate = formatter.format(this.getBidDate());
        return " Bid " + this.getBidId() + ": \n Buyer ID: " + this.getBuyer().getBuyerId()
                + "\n Bid Price: $" + String.format("%.2f", this.getBidPrice())
                + "\n Bid Date: " + bidDate;
    }
}