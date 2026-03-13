public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet){
        this.pet = pet;
    }

    public void removePet(){
        pet = null;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person other){

        if(pet == null){
            System.out.println(name + " has no pet.");
            return;
        }

        other.assignPet(pet);
        pet = null;
    }

    public void retrievePetFrom(Person other){

        if(other.pet == null){
            System.out.println("No pet to retrieve");
            return;
        }

        this.pet = other.pet;
        other.pet = null;
    }

    public String toString(){

        String petInfo = (pet == null) ? "no pet" : pet.toString();

        return name + " (" + age + ") - " + getOccupation()
                + " | Pet: " + petInfo;
    }
}