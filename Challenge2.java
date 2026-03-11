import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers ?");
        int n= sc.nextInt();
        int max=0;
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Number "+(i+1)+":");
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        sc.close();
        System.out.println("Largest Number: "+max);
    }
}
