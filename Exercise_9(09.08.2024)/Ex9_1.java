/*find the sum of a series of number using recursion */
public class Ex9_1{
    public static void main(String args[]){
        double num = 8.0;
        System.out.println(sum_of_numbers(num,0));
        
    }
    public static double sum_of_numbers(double num,double sum){
        if (num == 0.0){
            return sum;
        }
        else{
            return sum_of_numbers(--num,sum+(num+1));
        }
    }
}