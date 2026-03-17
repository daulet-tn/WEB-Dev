public class Main{

    public static void main(String[] args){
        Restaurant restaurant = new Restaurant();

        Cat cat = new Cat();

    Student student = new Student("Daulet");

    restaurant.servePizza(cat);
    restaurant.servePizza(student);
    }
}