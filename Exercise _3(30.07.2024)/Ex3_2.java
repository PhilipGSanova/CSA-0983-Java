/*create abstract class A and also class B inherits class A, generate object for class B and display the text "call me from B" */
abstract class A{
    public abstract void call();
}

class B extends A{
    @Override
    public void call(){
        System.out.println("Call me from B");
    }
}
 
public class Ex3_2 {
    public static void main(String[] args) {
        B b = new B();
        b.call();
    }
}