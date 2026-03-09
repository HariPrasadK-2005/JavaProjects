import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number: ");
        double a= sc.nextDouble();

        System.out.println("Enter your 2nd number: ");
        double b= sc.nextDouble();

        System.out.println("Select operation: + - * / ");
        System.out.println("Enter your choice: ");
        String op=sc.next();
        double result;

        if (op.equals("+")) {
            result=a+b;
        }
        else if (op.equals("-")) {
            result=a-b;
        }
        else if (op.equals("*")) {
            result=a*b;
        }
        else if (op.equals("/")) {
            result=a/b;
        }
        else{
            System.out.println("Invalid Operator");
            return;
        }
        System.out.println("Answer: "+result);
    }
}
