public class Spheree extends Shape3d{
    private radiuss;

    public Spheree(double r){
        this.radiuss = r;
    }

    @Override
    public double volume(){
        return (4 / 3)  * Math.PI * radiuss * radiuss *radiuss;
    }

    @Override
    public double surfaceAreaa(){
        return 4 * Math.PI * radiuss * radiuss;
    }
}