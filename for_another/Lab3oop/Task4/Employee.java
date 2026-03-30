import java.util.Date;

class Employee extends Person implements Comparable<Employee>, Cloneable {
    double salary;
    Date hireDate;
    String id;

    Employee(String name, double salary, Date hireDate, String id) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.id = id;
    }

    public String toString() {
        return super.toString() + " Salary: " + salary;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) return false;
        return id.equals(((Employee)obj).id);
    }

    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

    public Employee clone() {
        try { return (Employee) super.clone(); }
        catch(Exception e) { return null; }
    }
}