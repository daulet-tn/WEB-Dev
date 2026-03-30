class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        return name.equals(((Person)obj).name);
    }
}