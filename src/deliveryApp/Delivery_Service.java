package deliveryApp;

import java.util.ArrayList;
import java.util.List;

public class Delivery_Service {

  private List<Customer> customers;
  private List<Delivery> deliveries;

  public Delivery_Service() {
    this.customers = new ArrayList<>();
    this.deliveries = new ArrayList<>();

  }

  public void registration(String name, String address) {
    Customer customer = new Customer(name, address);
    customers.add(customer);
    System.out.println("Customer registered: " + customer.getCustomerID());
  }

  public void displayCustomers() {
    for (Customer customer : customers) {
      System.out.println("Registered customers list: ");
      System.out.println("Customer ID = " + customer.getCustomerID() + " customer name = " + customer.getName()
          + " customer address = " + customer.getAddress());
    }
  }

  public Customer findCustomer(int customerID) {
    for (Customer customer : customers) {
      if (customer.getCustomerID() == customerID) {
        return customer;
      }
    }
    return null;
  }

  public Delivery findDelivery(int deliveryID) {
    for (Delivery delivery : deliveries) {
      if (delivery.getDeliveryID() == deliveryID) {
        return delivery;
      }
    }
    return null;
  }

  public void deliveryPlacement(String itemName, double weight, int customerID) {
    Customer customer = findCustomer(customerID);
    if (customer != null) {
      Delivery delivery = new Delivery(itemName, weight, customer);
      deliveries.add(delivery);
      System.out.println("Delivery recived: " + delivery.getDeliveryID());
    } else {
      System.out.println("Delivery not placed: " + customerID);
    }

  }

  public void deliveryDelivered(int deliveryID) {
    Delivery delivery = findDelivery(deliveryID);
    if (delivery != null) {
      delivery.markDeliveryAsDelivered();
      System.out.println("Delivered: " + delivery.getDeliveryID());
    } else {
      System.out.println("Delivers not found: " + deliveryID);
    }
  }

  public void displyDelevary() {
    for (Delivery delivery : deliveries) {
      System.out.println("Delivery ID = " + delivery.getDeliveryID() + " item name =" + delivery.getItemName()
          + " delivery weight = " + delivery.getWeight() + " status of delivery = " + delivery.isDelivered()
          + " customer name" + delivery.getCustomer().getName());
    }
  }
}
