public class MethodsDemo {
    public static void main(String[] args) {
        int sum=add(10,20);
        System.out.println(sum);

        findmax(90,77);

        greet("Hari Prasad");
    }
    static int add(int x,int y){
        return x+y;
    }
    static void findmax(int x, int y){
        if (x>y) {
            System.out.println("Max: "+x);
        }
        else{
            System.out.println("Max: "+y);
        }
    }
    static void greet(String name){
        System.out.println("Hello "+name+"!"+" Welcome!");
    }
}
