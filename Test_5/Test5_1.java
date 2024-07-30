/* create a class Box with data members height,depth,width and volume method. Create two sub classes BoxWeight with data members weight
 * and create Shipment class with cost data members */
class Box {
    double height;
    double depth;
    double width;

    Box(double height,double depth,double width){
        this.height = height;
        this.depth = depth;
        this.width  = width;
    }

    public double volume(){
        return height*depth*width;
    }
}
class BoxWeight extends Box{
    double weight;

    BoxWeight(double  height, double  depth, double  width,double weight) {
        super(height, depth, width);
        this.weight = weight;
    }
}

class Shipment extends BoxWeight{
    double cost;
    Shipment(double height, double depth, double width, double weight,double cost) {
        super(height, depth, width, weight);
        this.cost = cost;
    }    
}
public class Test5_1 {
    public static void main(String[] args) {
        
        Shipment s = new Shipment(2,3,4,5,894);

        System.out.println("Height of the box: "+s.height);
        System.out.println("Depth of the box: "+s.depth);
        System.out.println("Width of the box: "+s.width);
        System.out.println("Volume of the box: "+s.volume());
        System.out.println("Weight of the box: "+s.weight);
        System.out.println("Cost of the box: "+s.cost);
    }
}