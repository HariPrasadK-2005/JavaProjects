import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to reverse: ");
        String s=sc.nextLine();
        sc.close();
        String reverse="";

        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        System.out.println(reverse);
    }
}
