public class Car {
    private String carMaker;
    private String carModel;

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
}