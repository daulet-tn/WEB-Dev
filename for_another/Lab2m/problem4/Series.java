public class Series extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potentialDifference;

    public Series(Circuit a, Circuit b) {
        c1 = a;
        c2 = b;
    }

    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    public double getPotentialDiff() {
        return potentialDifference;
    }

    public void applyPotentialDiff(double V) {

        potentialDifference = V;

        double I = V / getResistance();

        c1.applyPotentialDiff(I * c1.getResistance());
        c2.applyPotentialDiff(I * c2.getResistance());
    }
}