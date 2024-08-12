import java.util.regex.*;

public class Ex7_3 {
    public static void main(String args[]){
        String str = "Tamil TamilNadu Tamil";
        Pattern p = Pattern.compile("\\s");
        String [] str2 = p.split(str);
        for (String i:str2){
            System.out.println(i);
        }
    }
}
