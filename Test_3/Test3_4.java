import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test3_4 {
    public static void main(String[] args) {
        ArrayList <String> name = new ArrayList<>();
        name.add("Ravi");
        name.add("Ramu");
        name.add("Vimal");
        name.add("Roja");

        //for each
        for (String i:name) {
            System.out.print(i+" ");
        }System.out.println();

        //iterator()
        Iterator <String> iterator = name.iterator();
        while (iterator.hasNext()){
            String Name = iterator.next();
            System.out.print(Name+" ");
        }System.out.println();

        //listIterator()
        ListIterator <String> listIterator = name.listIterator();
        while (listIterator.hasNext()){
            String Name = listIterator.next();
            System.out.print(Name+" ");
        }System.out.println();
    }
}
