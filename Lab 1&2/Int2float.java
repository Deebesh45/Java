import java.util.Scanner;
class Int2float{
    public static void main(String args[]){
        float b;
        int a;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter a integer variable:");
        a=s1.nextInt();
        b=(float) a;
        System.out.println("The float variable is: "+b);
        System.out.println("The integer variable is: "+a);
        s1.close();
    }
}