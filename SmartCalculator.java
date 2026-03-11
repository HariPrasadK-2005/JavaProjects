import java.util.*;
public class SmartCalculator {
    static double add(double x, double y){
        return x+y;
    }
    static double subract(double x, double y){
        return x-y;
    }
    static double multiply(double x, double y){
        return x*y;
    }
    static double divide(double x, double y){
        if(y==0){
            System.out.println("Error! Cannot divide by zero");
            return 0;
            }
        else return x/y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";

        System.out.println("------Smart Calculator------");
        System.out.println("Options: + - * /");
        System.out.println("Type 'quit' to exit");
        System.out.println("----------------------------");

        while(!op.equals("quit")){
            System.out.println("Enter your choice (+, -, *, /, quit ): ");
            op =sc.next();

            if (op.equals("quit")) {
                System.out.println("Good Bye !");
                sc.close();
                break;
            }

            System.out.println("Enter the 1st Number: ");
            double a = sc.nextDouble();

            System.out.println("Enter the 2nd Number: ");
            double b = sc.nextDouble();
            

            double result=0;

            if(op.equals("+")) result=add(a,b);
            else if(op.equals("-")) result=subract(a,b);
            else if(op.equals("*")) result=multiply(a,b);
            else if(op.equals("/")) result=divide(a,b);
            else System.out.println("Invalid operator");

            System.out.println("Answer: "+result);
        }
    }
}
