package edu.monash.fit2099.bids;
import edu.monash.fit2099.buyers.Buyer;

import java.util.Date;
import java.util.HashMap;

public class BidsManager {

    HashMap<Integer, Bid> bidsManage = new HashMap<>();

    public BidsManager() { }

    public HashMap<Integer, Bid> getBidsManage() {
        return this.bidsManage;
    }

    public void addBid(int buyerId, double bidPrice, Date bidDate) {
        int bidIds = bidsManage.size();
        Buyer buyer = new Buyer(buyerId);
        Bid newBid = new Bid((bidIds+1), buyer, bidPrice, bidDate);
        bidsManage.put(buyerId, newBid);
    }

}
