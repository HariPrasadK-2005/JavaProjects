import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int num=sc.nextInt();
        sc.close();
        int num1=num;
        int reverse=0;

        while (num!=0) {
            int mod = num%10;
            reverse=reverse*10+mod;
            num=num/10;
        }
        System.out.println((num1==reverse)?"Palindrome":"Not Palindrome");
    }
}
