public class Main {

    public static void main (String[] args){

        System.out.println("    Dog1     ");
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
        d1.eat("meat");

        System.out.println("       Dog2      ");
        Dog d2 = new Dog("Aktos", "White");
        d2.showInfo();
        d2.makeSound();
    }
}