abstract class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
    }

    abstract void start();

    void showModel() {
        System.out.println("Model: " + model);
    }
}