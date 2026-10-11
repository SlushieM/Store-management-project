
import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.println("Welcome to our Pizza Store! \nEnter the number for your selection:Are you dining in or taking out?");

    // Ask dining preference
    System.out.println("1. Dine In\n2.Takeout");

    int diningChoice = input.nextInt();

    // Take pizza order
    System.out.println("\nWhat type of pizza would you like?\n1. Pepperoni\n2. Vegetarian\n3. Cheese");

     int typeChoice = input.nextInt();
      String Type;
      if (typeChoice == 1) {
        Type = "pepperoni";
      } else if (typeChoice == 2) {
        Type = "vegetarian";
      } else if (typeChoice == 3) {
        Type = "cheese";
      } else {
       System.out.println("Sorry! We don't have any other options."); 
        input.close();
        return;
      }
      
   System.out.println("\nWhat size will you be taking today?\n1. Small\n2. Medium\n3. Large");
       int sizeChoice = input.nextInt();
      String Size;
      if (sizeChoice == 1) {
      Size = "small";
        
      } else if (sizeChoice == 2) {
     Size = "medium";
    
      } else if (sizeChoice == 3) {
        Size = "large";
      } else {
        System.out.println("Sorry! We don't have any other options.");
        input.close();
        return;
      }
      
      Pizza newOrder;
      if (typeChoice == 1) {
        pepperoni one = new pepperoni();
        System.out.println("\nHow much pepperoni do you want?");
        int slices = input.nextInt();
        one.setpepperoniSlices(slices);
        newOrder = one;
      } else if (typeChoice == 2) {
        vegetarian two = new vegetarian();
        System.out.println("\nWhat veggies do you want?");
        input.nextLine();
        String veggies = input.nextLine();
        two.setveggieToppings(veggies);
        newOrder = two;
      }else {
        newOrder = new vegetarian();
      }
      
      newOrder.setSize(Size);
      if (diningChoice == 1) {
        newOrder.plate();
      }
      System.out.println("\nHere's Your Order!");
      System.out.println(newOrder.toString());
      input.close();
    }
}
