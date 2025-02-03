package main;

import service.RentalService;
import vehicle.Vehicle;
import customer.Customer;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("V001", "Toyota Corolla", 50.0);
        Vehicle bike = new Vehicle("V002", "Yamaha R15", 20.0);

        Customer customer1 = new Customer("C001", "Emma Solis", "1234567890");
        Customer customer2 = new Customer("C002", "Jane Smith", "0987654321");

        RentalService rentalService = new RentalService();
        rentalService.addRental(car, customer1, 5);
        rentalService.addRental(bike, customer2, 3);

//        System.out.println(car);

        System.out.println("All Rentals:");
        System.out.println(rentalService);

        System.out.println("\nFiltered Rentals (Price <= 30):");
        rentalService.filterByPrice(30).forEach(System.out::println);

        rentalService.sortRentalsByCustomerName();
        System.out.println("\nSorted Rentals by Customer Name:");
        System.out.println(rentalService);
    }
}
