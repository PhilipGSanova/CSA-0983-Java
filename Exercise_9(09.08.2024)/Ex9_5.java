/*print a series of number using recursion */
public class Ex9_5 {
    public static void main(String args[]){
        int num = 10;
        series(num,1);
    }
    public static void series(int num,int i){
        if (num == 0){
            return;
        }else{
            System.out.print((num+i)-num+",");
            series(num-1,i+1);
        }
    }
}
