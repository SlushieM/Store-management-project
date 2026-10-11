public class vegetarian extends Pizza {
 private String veggieToppings;
  
 public vegetarian() {
   super();
 veggieToppings = "";
 }
  
public vegetarian(String name, String size, double price, String veggieToppings) {
  super(name, size, price);
  this.veggieToppings = veggieToppings;
}
  
  public String getveggieToppings() {
    return veggieToppings;
  }
  
  public void setveggieToppings(String veggieToppings) {
    this.veggieToppings = veggieToppings;
  }
  
  public String toString() {
    return super.toString() + "\nCurrent veggieToppings: " + veggieToppings;
  }
}



