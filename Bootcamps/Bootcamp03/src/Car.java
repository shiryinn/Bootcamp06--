import java.util.ArrayList;
import java.util.Date;

public class Car {

    private String carMaker;
    private String carModel;
    private ArrayList<Bid> bids = new ArrayList<>();
    private int bidIdCount = 0;

    public Car(String newMaker, String newModel) {
        this.carMaker = newMaker;
        this.carModel = newModel;
    }

    public String getCarMaker() {
        return this.carMaker;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public String description() {
        // Task 3
        //String carDescription = getCarMaker() + getCarModel();
        // Task 4
        String carDescription = "Maker:" + getCarMaker() + " and Model:" + getCarModel();
        return carDescription;
    }

    public ArrayList<Bid> getBids(){
        return this.bids;
    }

    public void addBid(Buyer newBuyer, double price, Date date) {
        this.bidIdCount++;
        Bid newBid = new Bid(bidIdCount, newBuyer, price, date);
        bids.add(newBid);
    }
}