package fruitbasket;


import java.util.ArrayList;

public class FruitBasket{
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fillBowl(args, fruits);
        displayFruits(fruits);
    }//end method main

    static void fillBowl(String[] args, ArrayList<Fruit> fruits){
        int i=0;
        while(i+4 <= args.length) {
            fruits.add(new Fruit(args[i], args[i+1], args[i+2], args[i+3]));
            i+=4;
        }//end while
    }//end method fillBowl

    static void displayFruits(ArrayList<Fruit> fruits) {
        for(Fruit fruit: fruits)
        System.out.println(fruit);
        //endfor
    }//end method displayFriuts
}//end class FruitBasket