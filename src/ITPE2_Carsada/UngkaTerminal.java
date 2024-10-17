package ITPE2_Carsada;

import java.util.Scanner;

abstract class Vehicle {
    private final String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void displayTime();

    public String getName() {
        return name;
    }
}

// Inherits the vehicle class
class MiniBus extends Vehicle {
    public MiniBus(String name) {
        super(name);
    }

    @Override
    public void displayTime() {
        System.out.println("Hi " + getName() + ", your approximated time of arrival using a Mini Bus/E-Bus going to Ungka Terminal is: 55 mins - 2 hours");
    }
}

// Inherits the vehicle class
class Jeep extends Vehicle {
    public Jeep(String name) {
        super(name);
    }

    @Override
    public void displayTime() {
        System.out.println("Hi " + getName() + ", your approximated time of arrival using a Jeep going to Ungka Terminal is: 30 mins - 1 hour");
    }
}

// Main class
public class UngkaTerminal {
    private final Scanner sc;

    public UngkaTerminal() {
        sc = new Scanner(System.in);
    }

    public void transpo() {
        System.out.println("Welcome to Carsada! ");
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + ", We are excited to have you here! Explore opportunities and level up your skills with Carsada. Start your journey today!");

        while (true) {
            System.out.println("Where are you currently?");
            System.out.println("1. Ungka Terminal");
            System.out.println("2. Tagbak Terminal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice here: ");
            String place = sc.nextLine().toLowerCase();

            switch (place) {
                case "ungka terminal":
                case "1":
                    choosingTranspo(name);
                    return; // Exit after choosing transportation
                case "tagbak terminal":
                case "2":
                    System.out.println("Sorry, this terminal is not supported yet.");
                    break;
                case "exit":
                case "3":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input, please try again.");
                    break;
            }
        }
    }

    private void choosingTranspo(String name) {
        while (true) {
            System.out.println("What is your preferred method of transportation?");
            System.out.println("1. Mini Bus/E-Bus");
            System.out.println("2. Jeep");
            System.out.print("Enter here: ");
            String vehicle = sc.nextLine().toLowerCase();
            Vehicle transportation;

            switch (vehicle) {
                case "mini bus":
                case "e-bus":
                case "1":
                    transportation = new MiniBus(name);
                    break;
                case "jeep":
                case "2":
                    transportation = new Jeep(name);
                    break;
                default:
                    System.out.println("Invalid input, please try again.");
                    continue; // Ask the user again for valid input
            }

            transportation.displayTime(); // Display time
            return; // Exit after displaying time
        }
    }
}
