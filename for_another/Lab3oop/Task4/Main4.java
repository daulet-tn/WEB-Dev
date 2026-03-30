import java.util.Date;

public class Main4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ali", 2000, new Date(), "1");
        Employee e2 = new Employee("Dana", 1800, new Date(), "2");

        Manager m = new Manager("Boss", 3000, new Date(), "3", 500);
        m.addEmployee(e1);
        m.addEmployee(e2);

        System.out.println(e1);
        System.out.println(m);
    }
}   