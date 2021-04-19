/**
 * A BidManager Class which manage the bids added
 * @author Lim Shir Yin
 * @version 11/04/2021
 * @see edu.monash.fit2099.buyers.Buyer
 * @see edu.monash.fit2099.exceptions.BidException
 */

package edu.monash.fit2099.bids;
import edu.monash.fit2099.buyers.Buyer;
import edu.monash.fit2099.exceptions.BidException;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;

public class BidsManager {

    HashMap<Integer, Bid> bidsManage = new HashMap<>();

    /**
     * Zero parameter Constructor
     */
    public BidsManager() { }

    /**
     * Return the bids added
     * @return Hashmap<Integer, Bid>
     */
    public HashMap<Integer, Bid> getBidsManage() {
        return this.bidsManage;
    }

    /**
     * An addBid method to add the Buyer's id, Bid's Price and Date
     * @param buyerId
     * @param bidPrice
     * @param bidDate
     * @throws BidException
     * @throws ParseException
     */
    public void addBid(int bidId, int buyerId, double bidPrice, Date bidDate) throws BidException, ParseException {
        Buyer buyer = Buyer.getInstance(buyerId);
        Bid newBid = new Bid((bidId), buyer, bidPrice, bidDate);
        this.bidsManage.put(bidId, newBid);

    }
}
