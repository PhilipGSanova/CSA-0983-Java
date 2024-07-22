import java.util.ArrayList;
public class Test3_1 {
    public static void main (String args[]) {
        ArrayList <String> animals = new ArrayList <>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        for(String i: animals){
            System.out.print(i+" ");
        }
        System.out.println();
        animals.add(2,"Elephant");
        for(String i: animals) {
            System.out.print(i+" ");
        }
    }
}
