import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Car> cars = new HashSet<>();

        Car c1 = new Car("Toyota", 2020, "Camry");
        Car c2 = new Car("Toyota", 2020, "Camry"); // duplicate
        Car c3 = new Car("BMW", 2022, "X5");

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);

        for (Car c : cars) {
            System.out.println(c);
        }

        System.out.println("Total cars in HashSet: " + cars.size());
    }
}