public class Cylinder extends Shape3D {
    private double radius;
    private double height;

    public Cylinder(double r, double h){
        this.radius = r;
        this.height = h;
    }

    // Pi * r^2

    @Override
    public double volume(){
        return Math.PI * radius * radius * height;
    }

    // 2 * Pi *r (h + r)

    @Override
    public double surfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
}