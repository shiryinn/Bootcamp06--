package edu.monash.fit2099.bids;

import edu.monash.fit2099.buyers.Buyer;

import java.util.Date;
import java.util.HashMap;

public class BidsManager {

    HashMap<Buyer, Bid> bidsManage = new HashMap<Buyer, Bid>();

    public BidsManager(HashMap<Buyer, Bid> bidsManage) {
        this.bidsManage = bidsManage;
    }

    public void addBid(int buyerId, double bidPrice, Date bidDate) {
        Bid bidsManage = new Bid();
        this.bidsManage.put(buyerId, );

    }
}
