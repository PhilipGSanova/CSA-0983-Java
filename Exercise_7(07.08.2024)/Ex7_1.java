/*take compile pattern "ab" for input string "abcabccabcbc" */

import java.util.regex.*;

public class Ex7_1{
    public static void main(String args[]){
        String str = "abcabccabcbc";
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()){
            count++;
            System.out.println(p+" is found at starting index "+m.start()+" to "+(m.end()-1));
        }
        System.out.println("No. of times "+p+" is present in the given string is "+count);
    }
}