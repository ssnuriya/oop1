package service;

import vehicle.Vehicle;
import customer.Customer;

public class RentalService {
    private Vehicle vehicle;
    private Customer customer;
    private int rentalDays;

    public RentalService() {
        this.vehicle = null;
        this.customer = null;
        this.rentalDays = 0;
    }
    public RentalService(Vehicle vehicle, Customer customer, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double calculateTotalPrice() {
        return rentalDays * vehicle.getPricePerDay();
    }

    @Override
    public String toString() {
        return "Rental Details:\n" +
                customer + "\n" +
                vehicle + "\n" +
                "Rental Days: " + rentalDays + "\n" +
                "Total Price: $" + calculateTotalPrice() + "\n";
    }

    public static boolean compareVehicles(Vehicle vehicle1, Vehicle vehicle2) {
       if (vehicle1.getPricePerDay() == vehicle2.getPricePerDay()) {
           return true;
       }
       return false;
    }
}
