package vehicle;
// information about a vehicle
public class Vehicle {
    private String vehicleId;
    private String model;
    private double pricePerDay;
//default constructor
    public Vehicle() {
        this.vehicleId = "";
        this.model = "";
        this.pricePerDay = 0.0;
    }
    public Vehicle(String vehicleId, String model, double pricePerDay) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.pricePerDay = pricePerDay;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
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
        return "Model: " + model + " (ID: " + vehicleId + ", Price/Day: $" + pricePerDay + ")";
    }
}
