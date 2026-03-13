public class Employee extends Person {

    private String jobTitle;

    public Employee(String name, int age, String job){
        super(name, age);
        jobTitle = job;
    }

    public String getOccupation(){
        return "Employee: " + jobTitle;
    }
}