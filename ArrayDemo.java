public class ArrayDemo {
    public static void main(String[] args) {
        int marks[]={90,75,80,72,68,70};
        System.out.println("Total Marls: "+marks.length);
        System.out.println("First Person Mark: "+marks[0]);
        System.out.println("Last person Marks: "+marks[marks.length-1]);

        System.out.println("All Marks");
        for(int i=0;i<marks.length;i++){
            System.out.println("Student "+(i+1)+" is "+ marks[i]);
        }
    }
}