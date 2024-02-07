package deliveryApp;

public class Customer {

  private String name;
  private String address;
  private int customerID;
  private static int uniqueID = 1;

  public Customer(String name, String address) {
    this.name = name;
    this.address = address;
    this.customerID = uniqueID++;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public int getCustomerID() {
    return customerID;
  }

}
