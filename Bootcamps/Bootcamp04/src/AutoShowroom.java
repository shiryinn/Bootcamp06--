import edu.monash.fit2099.bids.Bid;
import edu.monash.fit2099.buyers.Buyer;
import edu.monash.fit2099.vehicles.Vehicle;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AutoShowroom {

    // Create an ArrayList car object
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Task 7
    // Implementing two arrayList to avoid duplicates
    //private ArrayList<edu.monash.fit2099.buyers.Buyer> buyersRec = new ArrayList<>();
    //private ArrayList<Integer> buyerIds = new ArrayList<>();

    public void printStatus() throws ParseException {
        System.out.println("Welcome to FIT2099 Showroom");

        Vehicle vehicle1 = new Vehicle("BMW", "X7");
        Vehicle vehicle2 = new Vehicle("Audi", "A8");
        Vehicle vehicle3 = new Vehicle("Mercedes", "GLS");
        // Task 3
        /* test cases for task 3
        System.out.println(car1.getCarDescription());
        System.out.println(car2.getCarDescription());
        System.out.println(car3.getCarDescription());
        */
        createCars();
        displayCars();
        // It terminates after the third time calling console
        buyerAndBidDetails(vehicles.get(0));
        buyerAndBidDetails((vehicles.get(1)));
        buyerAndBidDetails((vehicles.get(2)));
        System.out.println("Thank you for visiting FIT2099 Showroom");
    }

    public ArrayList<Vehicle> getCars() {
        return this.vehicles;
    }

    // Task 7
    /*
    public ArrayList<edu.monash.fit2099.buyers.Buyer> getBuyers() {
        return this.buyersRec;
    }
    */


    public void createCars() throws ParseException {
        Vehicle vehicle1 = new Vehicle("BMW", "X7");
        Vehicle vehicle2 = new Vehicle("Audi", "A8");
        Vehicle vehicle3 = new Vehicle("Mercedes", "GLS");
        // add element into car ArrayList by add operation
        vehicles.add(0, vehicle1);
        vehicles.add(1, vehicle2);
        vehicles.add(2, vehicle3);

        // test cases for Task 5
        // Create buyers
        Buyer buyer1 = new Buyer(1, "Ashley", "Kristin");
        Buyer buyer2 = new Buyer(2, "John", "Dell");
        Buyer buyer3 = new Buyer(3, "Andy", "Sam");
        // Create bids
        DateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        Date newBidDate1 = dateFormatter.parse("07-05-2019");
        Date newBidDate2 = dateFormatter.parse("04-03-2020");
        Bid bid1 = new Bid(1, buyer1, 150000.00, newBidDate1);
        Bid bid2 = new Bid(2, buyer2, 120000.00, newBidDate2);
        // Add bids
        vehicle1.addBid(buyer1, 50000.00, newBidDate1);
        vehicle2.addBid(buyer2, 15000.00, newBidDate2);
        vehicle2.addBid(buyer2, 20000.00, newBidDate1);
        vehicle3.addBid(buyer3, 15000.00, newBidDate2);

    }

    public void displayCars() {
        for(int i = 0; i < vehicles.size(); i++) {
            String carsDesc = "Car (" + (i+1) + ") " + vehicles.get(i).description();
            System.out.println(carsDesc);

            // display the lists of bids and buyers
            ArrayList<Bid> bidsCar = vehicles.get(i).getBids();
            for (Bid currentBid : bidsCar) {
                Buyer bidBuyer = currentBid.getBuyer();
                // change date format
                Format reformatDate = new SimpleDateFormat("dd/MM/yyyy");
                String bidDate = reformatDate.format(currentBid.getBidDate());
                String buyerBidDesc = "edu.monash.fit2099.bids.Bid " + currentBid.getBidId() + ": \n----------------------------" +"\nedu.monash.fit2099.buyers.Buyer's ID: "
                        + bidBuyer.getBuyerId() + "\nedu.monash.fit2099.buyers.Buyer's Name: " + bidBuyer.getGivenName()
                        + " " + bidBuyer.getFamilyName() + "\nedu.monash.fit2099.bids.Bid's Price: $"
                        + String.format("%.2f", currentBid.getBidPrice()) + "\nedu.monash.fit2099.bids.Bid's Date: " + bidDate + "\n----------------------------";
                System.out.println(buyerBidDesc);
            }
        }
    }

    // Task 6
    // Console I/O for each input
    // edu.monash.fit2099.buyers.Buyer's input name
    public static String[] inputBuyerName(){
        System.out.println("----------------------------");
        System.out.println("Please enter the details:");
        // input buyer's given name
        Scanner scanGivenName = new Scanner(System.in);
        System.out.print("edu.monash.fit2099.buyers.Buyer's given name: ");
        String buyerGivenName = scanGivenName.nextLine();
        // input buyer's family name
        Scanner scanFamilyName = new Scanner(System.in);
        System.out.print("edu.monash.fit2099.buyers.Buyer's family name: ");
        String buyerFamilyName = scanFamilyName.nextLine();

        return new String[]{buyerGivenName, buyerFamilyName};
    }

    // edu.monash.fit2099.buyers.Buyer's input ID
    public static int inputBuyerId(){
        // initialise buyerId to 0
        int buyerId = 0;
        boolean check = true;
        while (check) {
            try {
                Scanner scanBuyerId = new Scanner(System.in);
                System.out.print("edu.monash.fit2099.buyers.Buyer's ID: ");
                buyerId = scanBuyerId.nextInt();
                check = false;
            }
            catch (Exception e) {
                System.out.println("Invalid ID!");
                System.out.println("Please enter a valid ID");
            }
        }
        return buyerId;
    }

    // edu.monash.fit2099.buyers.Buyer's input price
    public static double inputBidPrice(){
        // initialise bid price to 0
        double buyerBidPrice = 0;
        boolean check = true;
        while (check) {
            try {
                Scanner scanBidPrice = new Scanner(System.in);
                System.out.print("edu.monash.fit2099.buyers.Buyer's bid price: ");
                buyerBidPrice = scanBidPrice.nextDouble();
                check = false;
            }
            catch (Exception e) {
                System.out.println("Invalid bid price!");
                System.out.println("Please enter a valid bid price");
            }
        }
        return buyerBidPrice;
    }

    // edu.monash.fit2099.buyers.Buyer's bid date
    public static Date inputBidDate(){
        // initialise date to null
        Date buyerBidDate = null;
        SimpleDateFormat reformatDate = new SimpleDateFormat("dd/MM/yyyy");
        boolean check = true;
        while (check) {
            try {
                // make sure dates enter are valid
                reformatDate.setLenient(false);
                Scanner scanBidDate = new Scanner(System.in);
                System.out.print("edu.monash.fit2099.bids.Bid date: ");
                buyerBidDate = reformatDate.parse(scanBidDate.next());
                check = false;
            }
            catch (ParseException e) {
                System.out.println("Invalid date!");
                System.out.println("Please enter a valid date in format dd/MM/yyyy");
            }
        }
        return buyerBidDate;
    }

    private void buyerAndBidDetails(Vehicle bidsVehicle) {
        String givenName;
        String famName;
        int buyerId;
        double bidCarPrice;
        Date bidDate;

        // Call console
        String[] buyerName = inputBuyerName();
        givenName = buyerName[0];
        famName = buyerName[1];
        buyerId = inputBuyerId();
        bidCarPrice = inputBidPrice();
        bidDate = inputBidDate();

    }

    /*
        // Task 7
        // Check if there's duplicates buyer's Id
        //While setting the check to be true, it will then loop through the while loop and go to the if loop. The if loop basically works
        the buyerIds ArrayList which is implemented and check if the new buyer's id exists in the arrayList. Iƒ there is not repeated Id,
        it will then add into buyersRec which is another arrayList created for recording the buyers and buyerIds will immediately add
        the new buyer id into it as well using arraylist add operations. The while loop will terminates with check = false.
        //Pseudocode: (idea)
        // Create new buyer after enter the details into console
        edu.monash.fit2099.buyers.Buyer newBuyer = new edu.monash.fit2099.buyers.Buyer(buyerId, givenName, famName);
        boolean check = true;
        while (check) {
            if (!buyerIds.contains(newBuyer.getBuyerId())) {
                buyerIds.add(newBuyer.getBuyerId());
                buyersRec.add(newBuyer);
                check = false;   // while loop terminates
            }
        }
        // Add bid on a car
        bidsCar.addBid(newBuyer, bidCarPrice, bidDate);
     */
}
