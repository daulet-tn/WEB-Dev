import java.util.ArrayList;

public class PersonRegistry {

    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p){
        people.add(p);
    }

    public void removePerson(Person p){
        people.remove(p);
    }

    public void printAll(){

        for(Person p : people){
            System.out.println(p);
        }

    }

    public String toString(){

        String result = "";

        for(Person p : people){
            result += p + "\n";
        }

        return result;
    }
}