/*overload the constructor with different datatypes 

write a java program to create a class called Point with instance variable x and y implement overloaded constructor one 
constructor takes int parameter other takes double parameters and print the value of variables for each constructor */
class Point {
    private double x;
    private double y;

    public Point(int x,int y){
        this.x = x; 
        this.y = y;
    }
    public Point(double x,double y){
        this.x = x; 
        this.y = y;
    }
    public void printCoordinates() {
        System.out.println("x = " + x + ", y = " + y);
    }
}
public class Ex8_1{
    public static void main(String args[]){
        Point p1 = new Point(10,20);
        Point p2 = new Point(10.5,20.5);
        p1.printCoordinates();
        p2.printCoordinates();
    }
}