import java.util.Scanner;
class Float2int{
    public static void main(String args[]){
        float a;
        int b;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter a float variable:");
        a=s1.nextFloat();
        b=(int) a;
        System.out.println("The integer variable is: "+b);
        s1.close();
    }
}