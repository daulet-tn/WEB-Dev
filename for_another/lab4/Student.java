class Student extends Person implements canHavePizza {

    public Student(String name){
        super(name);
    }

    public void eatPizza(){
        System.out.println(name + "is eating pizza");
    }
}