class Vehicle{
    public void startengine(){
        System.out.println("Start the vehicle engine");
    }
    public void stopengine(){
        System.out.println("Stop the vehicle engine");
    }
}

class Car extends Vehicle{
    @Override
    public void startengine(){
        System.out.println("Start the car engine");
    }

    @Override
    public void stopengine(){
        System.out.println("Stop the car engine");
    }
}

class Motorcycle extends Vehicle{
    @Override
    public void startengine(){
        System.out.println("Start the motorcycle engine");
    }

    @Override
    public void stopengine(){
        System.out.println("Stop the motorcycle engine");
    }
}
public class Ex3_1{
    public static void main(String args[]) {
        Car c = new Car();
        Motorcycle m = new Motorcycle();
        c.startengine();
        m.startengine();
        m.stopengine();
        c.stopengine();
    }
}