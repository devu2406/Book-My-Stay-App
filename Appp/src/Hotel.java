/**
 * Use Case 1: Application Entry & Welcome Message
 * Hotel Booking Management System
 */

/**
 * Use Case 2: Basic Room Types & Static Availability
 * Description:
 * This class demonstrates room initialization
 * using domain models before introducing
 * centralized inventory management.
 *
 * Availability is represented using
 * simple variables to highlight limitations.
 *
 * @version 2.1
 */

public class Hotel {

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization");

        System.out.println("Single Room:");
        System.out.println("Beds: 1");
        System.out.println("Size: 250 sqft");
        System.out.println("Price per night: 1500.0");
        System.out.println("Available: 5");

        System.out.println("Double Room:");
        System.out.println("Beds: 2");
        System.out.println("Size: 400 sqft");
        System.out.println("Price per night: 2500.0");
        System.out.println("Available: 3");

        System.out.println("Suite Room:");
        System.out.println("Beds: 3");
        System.out.println("Size: 600 sqft");
        System.out.println("Price per night: 5000.0");
        System.out.println("Available: 2");
    }
}