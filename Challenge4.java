import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        int f1=0;
        int f2=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter terms: ");
        int term=sc.nextInt();
        sc.close();
        int fib=0;
        if (term==1) {
            System.out.println("Fibanocci Series: "+f1);
        }
        else if (term==2) {
            System.out.println("Fibanocci Series: "+f1+" "+f2);
        }
        else if(term>2){
            System.out.print("Fibanocci Series: 0 1 ");
            for(int i=3;i<=term;i++){
                fib=f1+f2;
                f1=f2;
                f2=fib;
                System.out.print(fib+" ");
            }
            
        }
    }
}
