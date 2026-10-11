public class pepperoni extends Pizza {

private int pepperoniSlices;

  public pepperoni() {
    super();
    pepperoniSlices = 15;
  }
public pepperoni(String name, String size, double price, int pepperoniSlices) {
  super(name, size, price);
  this.pepperoniSlices = pepperoniSlices;
}
public int getPepperoniSlices() {
  return pepperoniSlices;
}
  public void setpepperoniSlices(int pepperoniSlices) {
    this.pepperoniSlices = pepperoniSlices;
  }
  public String toString() {
    return super.toString() + "Amount of Pepperoni: " + pepperoniSlices;
  }
}



