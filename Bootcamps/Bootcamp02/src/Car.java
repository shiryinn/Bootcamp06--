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

    // Task 4
    public String getCarDescription() {
        String carsDescription = "Maker:" + getCarMaker() + " and Model:" + getCarModel();
        return carsDescription;
    }
}

