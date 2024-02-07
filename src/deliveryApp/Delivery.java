package deliveryApp;

public class Delivery {

  private String itemName;
  private double weight;
  private int deliveryID;
  private static int uniqueIdentifier = 1;
  private Customer customer;
  private boolean delivered;

  public Delivery(String itemName, double weight, Customer customer) {
    this.itemName = itemName;
    this.weight = weight;
    this.deliveryID = uniqueIdentifier++;
    this.customer = customer;
    this.delivered = false;

  }

  public String getItemName() {
    return itemName;
  }

  public double getWeight() {
    return weight;
  }

  public int getDeliveryID() {
    return deliveryID;
  }

  public Customer getCustomer() {
    return customer;
  }

  public boolean isDelivered() {
    return delivered;
  }
  public void markDeliveryAsDelivered() {
    delivered = true;
  }

}
