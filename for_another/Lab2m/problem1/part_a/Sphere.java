public class Sphere extends Shape3D{
    private double radius;

    public Sphere(double r){
        this.radius = r;
    }

    // 4/3 * Pi * r^3

    @Override
    public double volume(){
        return (4.0/3.0) * Math.PI * radius * radius *radius;
    }

    // 4 * Pi * r^2
    
    @Override
    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
}