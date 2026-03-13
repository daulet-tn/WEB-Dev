public class Cube extends Shape3D{
    private double side;

    public Cube(double s){
        this.side = s;
    }

    // side =s^3

    @Override
    public double volume(){
        return side * side * side;
    }

    // sArea = 6 * s^2
    
    @Override
    public double surfaceArea(){
        return 6 * side * side;
    }
}