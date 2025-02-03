package vehicle;

import core.RentalEntity;

public class Vehicle extends RentalEntity {
    private String model;
    private double pricePerDay;

    public Vehicle(String id, String model, double pricePerDay) {
        super(id);
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() + ", Model: " + model + ", Price/Day: $" + pricePerDay;
    }
}
