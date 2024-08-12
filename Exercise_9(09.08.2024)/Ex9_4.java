/*factorial using recursion */
public class Ex9_4 {
    public static void main(String args[]){
        int num = 9;
        System.out.println(factorial(5));
    }
    public static int factorial(int num){
        if (num == 0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}