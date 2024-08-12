import java.util.ArrayList;

public class Ex5_1{
    public static void main(String[] args) {
        ArrayList<String> carBrands = new ArrayList<>();

        carBrands.add("Toyota");
        carBrands.add("Honda");
        carBrands.add("Ford");
        carBrands.add("Chevrolet");
        carBrands.add("Nissan");
        carBrands.add("BMW");
        carBrands.add("Mercedes-Benz");
        carBrands.add("Audi");
        carBrands.add("Volkswagen");
        carBrands.add("Hyundai");

        for(String brand : carBrands) {
            System.out.println(brand);
        }
    }
}