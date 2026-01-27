import java.util.Scanner;

public class area{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println(" Length ");
        int a = scanner.nextInt();
        double b = a;

        System.out.println("Area " + a*a);
        System.out.println("perimeter " + a*4);
        System.out.println("diagonal " + Math.sqrt(2)*b);

    }
}