import java.util.Objects;

public class Car extends Vehicle {

    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + " Model: " + model;
    }

    // проверяем на совпадение 
    @Override
    // берем обжект
    public boolean equals(Object o) {
        //сразу проверяем
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        //меняем на кар 
        Car c = (Car) o;

        return model.equals(c.model);
    }

    // хэш чекаем
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }
}