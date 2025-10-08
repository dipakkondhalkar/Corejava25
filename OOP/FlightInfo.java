/*7. Create a Flight class with flightNumber, destination, and fare. Create 3 flight objects. Display flights with fare under ₹5000.
📝 Explanation:
 Use if (fare < 5000) to filter and print flight details. */


import java.util.Scanner;

class Flight {
    private int flightNumber;
    private String destination;
    private int fare;

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public void display() {
        System.out.println("Flight No: " + flightNumber + ", Destination: " + destination + ", Fare: ₹" + fare);
    }
}

public class FlightInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 3 Flight objects
        Flight f1 = new Flight();
        Flight f2 = new Flight();
        Flight f3 = new Flight();

        // Input for flight 1
        System.out.println("Enter details for Flight 1:");
        System.out.print("Flight Number: ");
        int num1 = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Destination: ");
        String dest1 = sc.nextLine();
        System.out.print("Fare: ");
        int fare1 = sc.nextInt();

        f1.setFlightNumber(num1);
        f1.setDestination(dest1);
        f1.setFare(fare1);

        // Input for flight 2
        System.out.println("\nEnter details for Flight 2:");
        System.out.print("Flight Number: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Destination: ");
        String dest2 = sc.nextLine();
        System.out.print("Fare: ");
        int fare2 = sc.nextInt();

        f2.setFlightNumber(num2);
        f2.setDestination(dest2);
        f2.setFare(fare2);

        // Input for flight 3
        System.out.println("\nEnter details for Flight 3:");
        System.out.print("Flight Number: ");
        int num3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Destination: ");
        String dest3 = sc.nextLine();
        System.out.print("Fare: ");
        int fare3 = sc.nextInt();

        f3.setFlightNumber(num3);
        f3.setDestination(dest3);
        f3.setFare(fare3);

        // Display flights with fare < 5000
        System.out.println("\nFlights with fare under ₹5000:");
        if (f1.getFare() < 5000) f1.display();
        if (f2.getFare() < 5000) f2.display();
        if (f3.getFare() < 5000) f3.display();
    }
}
/*
output:
Enter details for Flight 1:
Flight Number: 101
Destination: Delhi
Fare: 4500

Enter details for Flight 2:
Flight Number: 102
Destination: Mumbai
Fare: 5200

Enter details for Flight 3:
Flight Number: 103
Destination: Kolkata
Fare: 3000

Flights with fare under ₹5000:
Flight No: 101, Destination: Delhi, Fare: ₹4500
Flight No: 103, Destination: Kolkata, Fare: ₹3000
*/
