import java.util.Scanner;

public class Analyzer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while(true){
            System.out.print("enter number or q ");
            String input = sc.nextLine();
            
            if (input.equalsIgnoreCase("Q")){
                break;
            }

            try{
                double value = Double.parseDouble(input);
                data.add(value);
            } catch (NumberFormatException e){
                System.out.println("Invalid input");
            }
        }
        System.out.println("Avarage = " + data.getAverage());
        System.out.println("Maximum = " + data.getMax());
    }
}