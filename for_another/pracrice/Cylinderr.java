public class Cylinderr extends Shape3d{
    private double radiuss;
    private double heightt;

    public Cylinderr(double r, double h){
        this.radiuss = r;
        this.heightt = h;

        @Override
        public double volumee(){
            return Math.PI * radiuss * radiuss; 
        }

        @Override
        public double surfaceAreaa(){
            return 2 * Math.PI * radiuss * (radiuss * heightt);
        }
    }
}