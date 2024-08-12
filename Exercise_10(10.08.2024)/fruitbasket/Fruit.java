 package fruitbasket;
 public class Fruit {
 String name;
 String colour;
 String category;
 int numberOfFruit;
 public Fruit(String name, String colour, String cat, String number) {
 this.name = name;
 this.colour= colour;
 this.category= cat;
 this.numberOfFruit= Integer.parseInt(number);
 }//end constructor
public String toString() {
 return "Fruit: " + name
 + "\nColour: " + colour
 + ", Category: " + category
 + ", Number in bowl: " + numberOfFruit
 + "\n";
 }//end method toString
 }//end class Fruit