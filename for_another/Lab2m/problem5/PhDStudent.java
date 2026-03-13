public class PhDStudent extends Student {

    private String researchField;

    public PhDStudent(String name, int age, String major, String research){
        super(name, age, major);
        researchField = research;
    }

    @Override
    public void assignPet(Animal pet){

        if(pet instanceof Dog){
            System.out.println("PhD students cannot take care of dogs.");
            return;
        }

        super.assignPet(pet);
    }

    public String getOccupation(){
        return "PhD Student (" + researchField + ")";
    }
}