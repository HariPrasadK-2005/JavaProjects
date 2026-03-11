import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args){
        // int age= 20;
        // String name="Hari";
        // double marks=99.5;
        // boolean pass=true;

        // System.out.println("Name: "+name);
        // System.out.println("Age: "+age);
        // System.out.println("Marks: "+marks);
        // System.out.println("Passed: "+pass);

        ///////////////////////////////////////////////////////////////////////////////
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your Name: ");
        // String name = sc.nextLine();

        // System.out.println("Enter your Age: ");
        // int age = sc.nextInt();

        // System.out.println("Hello "+name+"!");
        // System.out.println("You are "+age+" years old.");
        //////////////////////////////////////////////////////////////////////////////
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Marks: ");
        double marks=sc.nextDouble();


        if (marks>=90) {
            System.out.println("Grade A - Excellent!");
        }
        else if (marks>=75) {
            System.out.println("Grade B - Good Job!");
        }
        else if (marks>=50) {
            System.out.println("Grade C - Keep Improving!");
        }
        else{
            System.out.println("Grade F - Don't Giveup");
        }
        sc.close();
    }
}