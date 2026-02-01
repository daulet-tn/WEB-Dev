public class Student{

    private String name;
    private int id;
    private int yearOFstady;

    public Student (String name, int id){
        this.name = name;
        this.id = id;
        this.yearOFstady = 1;
    }

    public String getName(){
        return name;
    }

    public int getid(){
        return id;
    }

    public void incrementyearOFstady(){
        yearOFstady++;
    }
}