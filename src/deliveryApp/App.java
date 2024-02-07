package deliveryApp;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    Delivery_Service delivery = new Delivery_Service();
    Scanner scan = new Scanner(System.in);
    
    while(true) {
      System.out.println("Delivery System:");
      System.out.println("1. Customer registration.");
      System.out.println("2. Place deliveries");
      System.out.println("3. Customers list");
      System.out.println("4. List of deliveries");
      System.out.println("5. Delivery which is delivered");
      System.out.println("6. Exit");
      System.out.println("Enter your choice");
      int choice = scan.nextInt();
      
      switch(choice) {
      case 1:
        System.out.println("Enter your name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("Enter your address: ");
        String address = scan.nextLine();
        delivery.registration(name, address);
        break;
      case 2:
        System.out.println("Enter item name: ");
        scan.nextLine();
        String itemName = scan.nextLine();
        System.out.println("Enter item weight: ");
        double weight = scan.nextDouble();
        System.out.println("Enter customer ID:");
        int iD = scan.nextInt();
        delivery.deliveryPlacement(itemName, weight, iD);
        break;
      case 3:
        delivery.displayCustomers();
        break;
      case 4:
        delivery.displyDelevary();
        break;
      case 5:
        delivery.deliveryDelivered(scan.nextInt());
        break;
      case 6:
        System.out.println("Exiting!");
        System.exit(0);
        default:
          System.out.println("Invalid choice!");
      }
      
    }

  }

}
