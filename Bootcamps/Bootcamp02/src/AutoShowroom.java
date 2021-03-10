public class AutoShowroom {

    private Car[] cars;

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
        cars = new Car[]{car1, car2, car3};
    }

    public void displayCars() {
        for(int i = 0; i < cars.length; i++) {
            String carsDesc = "Car (" + (i+1) + ") " + cars[i].getCarDescription();
            System.out.println(carsDesc);
        }
    }
}

