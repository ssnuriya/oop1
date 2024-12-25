package main;

import vehicle.Vehicle;
import customer.Customer;
import service.RentalService;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("V001", "Toyota Corolla", 50.0);
        Vehicle bike = new Vehicle("V002", "Yamaha R15", 20.0);

        Customer customer1 = new Customer("C001", "John Doe", "1234567890");
        Customer customer2 = new Customer("C002", "Jane Smith", "0987654321");

        RentalService rental1 = new RentalService(car, customer1, 5);
        RentalService rental2 = new RentalService(bike, customer2, 5);
        System.out.println(rental1); rental1.toString();
        System.out.println(rental2);
        System.out.println("Are the vehicles same price per day? " + RentalService.compareVehicles(car, bike));
    }
}
