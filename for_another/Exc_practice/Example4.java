/*import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), "+", true);

       try
       {
          leftString   = tokenizer.nextToken();
          operator     = tokenizer.nextToken();
          rightString  = tokenizer.nextToken();

          leftOperand  = Double.parseDouble(leftString);
          rightOperand = Double.parseDouble(rightString);

          if (operator.equals("+"))
             result = leftOperand + rightOperand;
          else
             result = 0.0;

          System.out.println("Result: " + result);
       }
       catch (NoSuchElementException nsee)
       {
          System.out.println("Invalid syntax");
       }
       catch (NumberFormatException nfe)
       {
          System.out.println("One or more operands is not a number");
       }


    }
}*/
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter expressions:");
        String input = in.nextLine();

        
        StringTokenizer expressions = new StringTokenizer(input, " ");

        while (expressions.hasMoreTokens())
        {
            String expr = expressions.nextToken();

            try
            {
                String operator = "";

                if (expr.contains("+")) operator = "+";
                else if (expr.contains("-")) operator = "-";
                else if (expr.contains("*")) operator = "*";
                else if (expr.contains("/")) operator = "/";

                StringTokenizer tokenizer = new StringTokenizer(expr, operator);

                String leftString = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand, rightOperand;

                
                try
                {
                    leftOperand = Double.parseDouble(leftString);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("First operand is not a number: " + leftString);
                    continue;
                }

                
                try
                {
                    rightOperand = Double.parseDouble(rightString);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Second operand is not a number: " + rightString);
                    continue;
                }

                double result = 0;

                switch (operator)
                {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;
                    case "-":
                        result = leftOperand - rightOperand;
                        break;
                    case "*":
                        result = leftOperand * rightOperand;
                        break;
                    case "/":
                        result = leftOperand / rightOperand;
                        break;
                    default:
                        System.out.println("Unknown operator in: " + expr);
                        continue;
                }

                System.out.println(expr + " = " + result);
            }
            catch (NoSuchElementException e)
            {
                System.out.println("Invalid syntax: " + expr);
            }
        }

        
    }
}
