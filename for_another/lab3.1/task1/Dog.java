public class Dog extends Animal{

    private String color;

    public Dog(){
        super();
        System.out.println("Dog created");
    }

    public Dog(String name, String color){
        super(name);
        this.color = color;
    }

    @Override
    public void makeSound(){
        System.out.println("Gav");
    }

    public void showInfo(){
        System.out.println("Name: " + name + ", Color: " + color);
    }
}