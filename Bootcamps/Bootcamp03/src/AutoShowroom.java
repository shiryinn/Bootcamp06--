import java.util.ArrayList;

public class AutoShowroom {

    // Create an ArrayList cars object
    private ArrayList<Car> cars = new ArrayList<Car>();

    public void printStatus() {
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
        System.out.println("Thank you for visiting FIT2099 Showroom");
    }

    public void createCars() {
        Car car1 = new Car("BMW", "X7");
        Car car2 = new Car("Audi", "A8");
        Car car3 = new Car("Mercedes", "GLS");
        cars.add(0, car1);
        cars.add(1, car2);
        cars.add(2, car3);
    }

    public void displayCars() {
        for(int i = 0; i < cars.size(); i++) {
            String carsDesc = "Car (" + (i+1) + ") " + cars.get(i).description();
            System.out.println(carsDesc);
        }
    }
}
