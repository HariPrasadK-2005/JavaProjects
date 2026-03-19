import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many Students ?");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] marks= new int[3];
        double[] average= new double[n];

        for(int i=0;i<n ;i++){
            System.out.println("\n Enter the name of Student "+(i+1)+": ");
            name[i]= sc.next();
            for(int j=0;j<3;j++){
                System.out.println("Enter the mark of Subject "+(j+1)+": ");
                marks[j]=sc.nextInt();
            }
            int total = sum(marks);
            average[i] = avg(total,n);
            String grade = grades(average[i]);

            System.out.println("\n===== Report Card =====");
            System.out.println("       Student "+(i+1)+"     ");
            System.out.println("Name    :"+name[i]);
            System.out.println("Marks   :"+marks[0]+"|"+marks[1]+"|"+marks[2]);
            System.out.println("Total   :"+total+" / 300");
            System.out.printf("Average : %.2f%n", average[i]);
            System.out.println("Grade   :"+grade);
            System.out.println("======================");

        }
        int index=0;
        for(int i=0;i<n;i++){
            if(average[i]>average[index]){
                index =i;
            }
        }
        System.out.printf("\n 🏆CLASS TOPPER "+name[index]+" with Average of %.2f%n",average[index]);
        sc.close();
    }
    static int sum(int[] arr){
        int sum=0;
        for(int x:arr) {
            sum=sum+x;
        }
        return sum;
    }
    static double avg(int total,int n)
    {
        double mean = (double)total/n;
        return mean;
    }
    static String grades(double avg){
        if(avg>=90){
            return "A - Excellent";
        }
        else if(avg >=75){
            return "B - Good";
        }
        else if(avg>=50){
            return "C - Average";
        }
        else{
        return "F - Fail";
        }
    }
}