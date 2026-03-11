import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        sc.close();
        int fact=1;
        if (n==0) {
            System.out.println("Factorial of"+n+" is 1");
            return;
        }
        else if(n>0){
            
            for(int i=1;i<=n;i++){
                fact*=i;
            }
        }
        System.out.println("Factorial of "+n+" is : "+fact);
    }
}
