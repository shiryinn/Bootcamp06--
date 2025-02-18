import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AutoShowroom {

    // Create an ArrayList car object
    private ArrayList<Car> cars = new ArrayList<>();

    // Task 7
    // Implementing two arrayList to avoid duplicates
    //private ArrayList<Buyer> buyersRec = new ArrayList<>();
    //private ArrayList<Integer> buyerIds = new ArrayList<>();

    public void printStatus() throws ParseException {
        System.out.println("Welcome to FIT2099 Showroom");

        Car car1 = new Car("BMW", "X7");
        Car car2 = new Car("Audi", "A8");
        Car car3 = new Car("Mercedes", "GLS");
        // Task 3
        /* test cases for task 3
        System.out.println(car1.getCarDescription());
        System.out.println(car2.getCarDescription());
        System.out.println(car3.getCarDescription());
        */
        createCars();
        displayCars();
        // It terminates after the third time calling console
        buyerAndBidDetails(cars.get(0));
        buyerAndBidDetails((cars.get(1)));
        buyerAndBidDetails((cars.get(2)));
        System.out.println("Thank you for visiting FIT2099 Showroom");
    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }

    // Task 7
    /*
    public ArrayList<Buyer> getBuyers() {
        return this.buyersRec;
    }
    */


    public void createCars() throws ParseException {
        Car car1 = new Car("BMW", "X7");
        Car car2 = new Car("Audi", "A8");
        Car car3 = new Car("Mercedes", "GLS");
        // add element into car ArrayList by add operation
        cars.add(0, car1);
        cars.add(1, car2);
        cars.add(2, car3);

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
        car1.addBid(buyer1, 50000.00, newBidDate1);
        car2.addBid(buyer2, 15000.00, newBidDate2);
        car2.addBid(buyer2, 20000.00, newBidDate1);
        car3.addBid(buyer3, 15000.00, newBidDate2);

    }

    public void displayCars() {
        for(int i = 0; i < cars.size(); i++) {
            String carsDesc = "Car (" + (i+1) + ") " + cars.get(i).description();
            System.out.println(carsDesc);

            // display the lists of bids and buyers
            ArrayList<Bid> bidsCar = cars.get(i).getBids();
            for (Bid currentBid : bidsCar) {
                Buyer bidBuyer = currentBid.getBuyer();
                // change date format
                Format reformatDate = new SimpleDateFormat("dd/MM/yyyy");
                String bidDate = reformatDate.format(currentBid.getBidDate());
                String buyerBidDesc = "Bid " + currentBid.getBidId() + ": \n----------------------------" +"\nBuyer's ID: "
                        + bidBuyer.getBuyerId() + "\nBuyer's Name: " + bidBuyer.getGivenName()
                        + " " + bidBuyer.getFamilyName() + "\nBid's Price: $"
                        + String.format("%.2f", currentBid.getBidPrice()) + "\nBid's Date: " + bidDate + "\n----------------------------";
                System.out.println(buyerBidDesc);
            }
        }
    }

    // Task 6
    // Console I/O for each input
    // Buyer's input name
    public static String[] inputBuyerName(){
        System.out.println("----------------------------");
        System.out.println("Please enter the details:");
        // input buyer's given name
        Scanner scanGivenName = new Scanner(System.in);
        System.out.print("Buyer's given name: ");
        String buyerGivenName = scanGivenName.nextLine();
        // input buyer's family name
        Scanner scanFamilyName = new Scanner(System.in);
        System.out.print("Buyer's family name: ");
        String buyerFamilyName = scanFamilyName.nextLine();

        return new String[]{buyerGivenName, buyerFamilyName};
    }

    // Buyer's input ID
    public static int inputBuyerId(){
        // initialise buyerId to 0
        int buyerId = 0;
        boolean check = true;
        while (check) {
            try {
                Scanner scanBuyerId = new Scanner(System.in);
                System.out.print("Buyer's ID: ");
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

    // Buyer's input price
    public static double inputBidPrice(){
        // initialise bid price to 0
        double buyerBidPrice = 0;
        boolean check = true;
        while (check) {
            try {
                Scanner scanBidPrice = new Scanner(System.in);
                System.out.print("Buyer's bid price: ");
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

    // Buyer's bid date
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
                System.out.print("Bid date: ");
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

    private void buyerAndBidDetails(Car bidsCar) {
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
        Buyer newBuyer = new Buyer(buyerId, givenName, famName);
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
