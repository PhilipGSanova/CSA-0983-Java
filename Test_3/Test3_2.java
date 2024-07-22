import java.util.ArrayList;
public class Test3_2 {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList <>();
        num.add(2);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(8);
        num.add(9);
        // Printing all numbers in ArrayList
        for(Integer i:num) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Printing size of the ArrayList

        System.out.println("Size of the ArrayList " +num.size());
        
        //get(index)
        System.out.println("Element at Index 4 "+num.get(4));

        //set(index,element)
        num.set(2,12);
        for(Integer i:num) {
            System.out.print(i+" ");
        }

    }
}
