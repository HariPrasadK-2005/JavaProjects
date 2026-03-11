import java.util.*;
public class Challenge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers ?");
        int n= sc.nextInt();
        int total = 0;
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Number "+(i+1)+":");
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        sc.close();
        double avg = total/ n;
        System.out.println("Sum: "+total);
        System.out.println("Average: "+avg);

    }
}
