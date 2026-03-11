import java.util.Scanner;

public class Challenge3 {
    static int add(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        return total;
    }
    static double avg(int[] arr,int sum){
        double mean;
        mean = sum/arr.length;
        return mean;
    }
    static int findMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    static int findMin(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers ?");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Number "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        sc.close();
        int sum=add(arr);
        System.out.println("Sum:  "+sum);

        double average=avg(arr,sum);
        System.out.println("Average:  "+average);

        int max = findMax(arr);
        System.out.println("Maximum element:  "+max);

        int min = findMin(arr);
        System.out.println("Minimum element:  "+min);
    }
}
