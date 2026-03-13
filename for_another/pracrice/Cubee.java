public class Cubee extends Shape3d{
    private double sidee;

    public Cubee(double s){
        this.sidee = s;
    }

    @Override
    public double volume(){
        return sidee * sidee * sidee;
    }
    
    @Override
    public double surfaceAreaa(){
        return 6 * sidee * sidee;
    }
}