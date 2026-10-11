public class Pizza {
    private String name;
    private String size;
    private double price;
    private String servingStyle; 

    public Pizza() {
        name = "Cheese Pizza";
        size = "Medium";
        price = 9.99;
        servingStyle = "box";  
    }

    public Pizza(String name, String size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
        servingStyle = null;
    }

  



  public void plate(){
    servingStyle = "plate";
  }
public void setSize(String size) {
  this.size = size;
}

  public String toString(){
    return "Pizza: " + name
      + "\nSize: " + size
      + "\nPrice: $" + price
      + "\nServing style: " + servingStyle;   
  }
  

}




