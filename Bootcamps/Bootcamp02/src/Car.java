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

    // Task 3
    public String getCarDescription() {
        String carDescription = getCarMaker() + " " + getCarModel();
        return carDescription;
    }

    // Task 4
    public String getCarsDescription() {
        String carsDescription = "Maker:" + getCarMaker() + " and Model:" + getCarModel();
        return carsDescription;
    }
}

