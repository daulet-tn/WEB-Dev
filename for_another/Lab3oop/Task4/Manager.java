import java.util.Vector;

class Manager extends Employee {
    Vector<Employee> team = new Vector<>();
    double bonus;

    Manager(String name, double salary, java.util.Date date, String id, double bonus) {
        super(name, salary, date, id);
        this.bonus = bonus;
    }

    void addEmployee(Employee e) {
        team.add(e);
    }

    public String toString() {
        return super.toString() + " Bonus: " + bonus;
    }
}