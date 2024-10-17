
package ITPE2_Carsada;
import java.util.Scanner;

public class NewClass {  
public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
        System.out.println("CarSada");
        //Ask the name of the user
        System.out.println("What is your name?");
        String name = sc.nextLine().toLowerCase();
        
        while(true){
        //Ask the curent location of the user
        System.out.println("Where are you currently");
        System.out.println("1. Tagbak Terminal");
        System.out.println("2. Ungka Terminal");
        System.out.println("3. Exit");
        String current = sc.nextLine().toLowerCase();
}
}
              if(place.equals("ungka terminal") || place.equals("1")){
                while(true){
                System.out.println("What is your preferred method of transportation?");
                System.out.println("1. Mini Bus/E-Bus");
                System.out.println("2. Jeep");
                String vehicle = sc.nextLine().toLowerCase();
                
                if(vehicle.equals("mini bus") || vehicle.equals("e-bus") || vehicle.equals("1")){
                    System.out.println("HI " + name + " your Approximated time of arrival using a Mini bus/E-Bus going to Ungka Terminal is: 55 mins. - 2 hours");
                    
                    while(true){
                    System.out.println("Would you like to view your the distance of your destination using Mini Bus?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String choice = sc.nextLine().toLowerCase();
                    
                    if(choice.equals("yes") || choice.equals("1")){
                        System.out.println("May display ja tak.an pa ko magbutang pota");
                    }
                    
                    else if(choice.equals("no") || choice.equals("2")){
                        break;
                    }
                    
                    else{
                        System.out.println("Invalid Input of view distance please try again");
                    }
                    break;
                }
                    break;
                }
                
                else if(vehicle.equals("jeep") || vehicle.equals("2")){
                   System.out.println("HI " + name + " your Approximated time of arrival using a Traditional Jeepney going to Ungka Terminal is: 50 mins. - 1.5 hours");
                    
                    while(true){
                    System.out.println("Would you like to view your the distance of your destination using Jeep?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String choice = sc.nextLine().toLowerCase();
                    
                    if(choice.equals("yes") || choice.equals("1")){
                        System.out.println("May display ja tak.an pa ko magbutang pota");
                    }
                    
                    else if(choice.equals("no") || choice.equals("2")){
                        break;
                    }
                    
                    else{
                        System.out.println("Invalid Input of view distance please try again");
                    }
                    break;
                }
                    break;
                }
                
                else{
                    System.out.println("Invalid Input of vehicle please try again");
                }
            }
                break;
            }
            
            else if (place.equals("gaisano") || place.equals("2")){
                while(true){
                System.out.println("What is your preferred method of transportation?");
                System.out.println("1. Mini Bus/E-Bus");
                System.out.println("2. Jeep");
                String vehicle = sc.nextLine().toLowerCase();
                
                if(vehicle.equals("mini bus") || vehicle.equals("e-bus") || vehicle.equals("1")){
                    System.out.println("HI " + name + " your Approximated time of arrival using a Mini bus/E-Bus going to Gaisano is: 36 mins. - 1 hour");
                    
                    while(true){
                    System.out.println("Would you like to view your the distance of your destination using a Mini Bus?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String choice = sc.nextLine().toLowerCase();
                    
                    if(choice.equals("yes") || choice.equals("1")){
                        System.out.println("May display ja tak.an pa ko magbutang pota");
                    }
                    
                    else if(choice.equals("no") || choice.equals("2")){
                        break;
                    }
                    
                    else{
                        System.out.println("Invalid Input of view distance please try again");
                    }
                    break;
                }
                    break;
                }
                
                else if(vehicle.equals("jeep") || vehicle.equals("2")){
                   System.out.println("HI " + name + " your Approximated time of arrival using a Traditional Jeepney going to Gaisano is: 1 hour - 1 hour and 30 mins.");
                    
                    while(true){
                    System.out.println("Would you like to view your the distance of your destination using Jeep?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String choice = sc.nextLine().toLowerCase();
                    
                    if(choice.equals("yes") || choice.equals("1")){
                        System.out.println("May display ja tak.an pa ko magbutang pota");
                    }
                    
                    else if(choice.equals("no") || choice.equals("2")){
                        break;
                    }
                    
                    else{
                        System.out.println("Invalid Input of view distance please try again");
                    }
                    break;
                }
                    break;
                }
                
                else{
                    System.out.println("Invalid Input of vehicle please try again");
                }
            }
                break;
            }
            
            else if (place.equals("jaro plaza") || place.equals("3")){
                while(true){
                System.out.println("What is your preferred method of transportation?");
                System.out.println("1. Mini Bus/E-Bus");
                System.out.println("2. Jeep");
                String vehicle = sc.nextLine().toLowerCase();
                
                if(vehicle.equals("mini bus") || vehicle.equals("e-bus") || vehicle.equals("1")){
                    System.out.println("HI " + name + " your Approximated time of arrival using a Mini bus/E-Bus going to Jaro Plaza is: 27 mins. - 55 mins.");
                    
                    while(true){
                    System.out.println("Would you like to view your the distance of your destination using a Mini Bus?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String choice = sc.nextLine().toLowerCase();
                    
                    if(choice.equals("yes") || choice.equals("1")){
                        System.out.println("May display ja tak.an pa ko magbutang pota");
                    }
                    
                    else if(choice.equals("no") || choice.equals("2")){
                        break;
                    }
                    
                    else{
                        System.out.println("Invalid Input of view distance please try again");
                    }
                    break;
                }
                    break;
                }
                
                else if(vehicle.equals("jeep") || vehicle.equals("2")){
                   System.out.println("HI " + name + " your Approximated time of arrival using a Traditional Jeepney going to Jaro Plaza is: 30 mins. - 55 mins.");
                    
                    while(true){
                    System.out.println("Would you like to view your the distance of your destination using Jeep?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String choice = sc.nextLine().toLowerCase();
                    
                    if(choice.equals("yes") || choice.equals("1")){
                        System.out.println("May display ja tak.an pa ko magbutang pota");
                    }
                    
                    else if(choice.equals("no") || choice.equals("2")){
                        break;
                    }
                    
                    else{
                        System.out.println("Invalid Input of view distance please try again");
                    }
                    break;
                }
                    break;
                }
                
                else{
                    System.out.println("Invalid Input of vehicle please try again");
                }
            }
                break;
            }
            
            else if (place.equals("st. clements") || place.equals("4")){
                while(true){
                System.out.println("What is your preferred method of transportation?");
                System.out.println("1. Mini Bus/E-Bus");
                System.out.println("2. Jeep");
                String vehicle = sc.nextLine().toLowerCase();
                
                if(vehicle.equals("mini bus") || vehicle.equals("e-bus") || vehicle.equals("1")){
                    System.out.println("HI " + name + " your Approximated time of arrival using a Mini bus/E-Bus going to St. Clements is: 40 mins. - 1 hour");
                    
                    while(true){
                    System.out.println("Would you like to view your the distance of your destination using a Mini Bus?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String choice = sc.nextLine().toLowerCase();
                    
                    if(choice.equals("yes") || choice.equals("1")){
                        System.out.println("May display ja tak.an pa ko magbutang pota");
                    }
                    
                    else if(choice.equals("no") || choice.equals("2")){
                        break;
                    }
                    
                    else{
                        System.out.println("Invalid Input of view distance please try again");
                    }
                    break;
                }
                    break;
                }
                
                else if(vehicle.equals("jeep") || vehicle.equals("2")){
                   System.out.println("HI " + name + " your Approximated time of arrival using a Traditional Jeepney going to St. Clements is: 30 mins. - 1 hour");
                    
                    while(true){
                    System.out.println("Would you like to view your the distance of your destination using Jeep?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String choice = sc.nextLine().toLowerCase();
                    
                    if(choice.equals("yes") || choice.equals("1")){
                        System.out.println("May display ja tak.an pa ko magbutang pota");
                    }
                    
                    else if(choice.equals("no") || choice.equals("2")){
                        break;
                    }
                    
                    else{
                        System.out.println("Invalid Input of view distance please try again");
                    }
                    break;
                }
                    break;
                }
                
                else{
                    System.out.println("Invalid Input of vehicle please try again");
                }
            }
                break;
            }
            
            else if(place.equals("back") || place.equals("5")){
                break;
            }
                    
            else{
                System.out.println("Invalid Input of current location please try again");
            }
        }
        }
        }