class Pet extends Person implements Talkable, Feedable {

    Pet(String name) {
        super(name);
    }

    public void talk() {
        System.out.println(name + " makes a sound");
    }

    public void feed() {
        System.out.println("Feeding " + name);
    }
}