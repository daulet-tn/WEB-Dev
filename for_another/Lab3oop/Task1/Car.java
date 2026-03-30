class Car extends Vehicle implements Drivable {

    Car(String model) {
        super(model);
    }

    public void drive() {
        System.out.println("Car is driving");
    }

    void start() {
        System.out.println("Car engine started");
    }
}
