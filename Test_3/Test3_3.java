import java.util.ArrayList;
public class Test3_3 {
    public static void main(String[] args) {
        ArrayList <String> lang = new ArrayList<>();
        lang.add("C");
        lang.add("C++");
        lang.add("Java");
        lang.add("Python");
        lang.add("Ruby");
        lang.add("JavaScript");
        // Printing all
        for (String i:lang){
            System.out.print(i+" ");
        }
        System.out.println();

        //remove()
        lang.remove("Ruby");
        for (String i:lang){
            System.out.print(i+" ");
        }
        System.out.println();

        //removeAll()
        ArrayList <String> lang2 = new ArrayList<>();
        lang2.add("JavaScript");

        lang.removeAll(lang2);
        for (String i:lang){
            System.out.print(i+" ");
        }
        System.out.println();

        //remove(index)
        lang.remove(1);
        for (String i:lang){
            System.out.print(i+" ");
        }
        System.out.println();

        //clear()
        lang.clear();
        for (String i:lang){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
