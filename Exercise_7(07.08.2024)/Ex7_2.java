import java.util.regex.*;

public class Ex7_2 {
    public static void main(String args[]){
        String str = "abcabccabcbcdakfguyagserfjasdf823754t5y3iu4he6teb8*^%##WJuewte86%&^%&6atwjqJWGDSARY%WEQALS";
        Pattern p1 = Pattern.compile("[ab]");
        Matcher m1 = p1.matcher(str);
        while (m1.find()){
            System.out.print(m1.group()+" ");
        }
        System.out.println();
        Pattern p2 = Pattern.compile("[^ab]");
        Matcher m2 = p2.matcher(str);
        while (m2.find()){
            System.out.print(m2.group()+" ");
        }
        System.out.println();
        Pattern p3 = Pattern.compile("[a-z]");
        Matcher m3 = p3.matcher(str);
        while (m3.find()){
            System.out.print(m3.group()+" ");
        }
        System.out.println();
        Pattern p4 = Pattern.compile("[A-Z]");
        Matcher m4 = p4.matcher(str);
        while (m4.find()){
            System.out.print(m4.group()+" ");
        }
        System.out.println();
        Pattern p5 = Pattern.compile("[a-zA-Z]");
        Matcher m5 = p5.matcher(str);
        while (m5.find()){
            System.out.print(m5.group()+" ");
        }
        System.out.println();
        Pattern p6 = Pattern.compile("[0-9]");
        Matcher m6 = p6.matcher(str);
        while (m6.find()){
            System.out.print(m6.group()+" ");
        }
        System.out.println();
        Pattern p7 = Pattern.compile("[a-zA-Z0-9]");
        Matcher m7 = p7.matcher(str);
        while (m7.find()){
            System.out.print(m7.group()+" ");
        }
        System.out.println();
        Pattern p8 = Pattern.compile("[^a-zA-Z0-9]");
        Matcher m8 = p8.matcher(str);
        while (m8.find()){
            System.out.print(m8.group()+" ");
        }
    }
}
