import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number  to check: ");
        int num=sc.nextInt();
        sc.close();

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
