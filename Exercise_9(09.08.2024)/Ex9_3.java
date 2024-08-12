/*String Palindrome or not using Recursion */
public class Ex9_3 {
    public static void main(String[] args) {
        String str = "malayalam";
        int end = (str.length())-1;
        System.out.println(is_palindrome(str, 0, end));
    }
    public static boolean is_palindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return is_palindrome(str, start+1, end-1);
    }
}