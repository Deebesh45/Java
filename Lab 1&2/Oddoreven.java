import java.util.Scanner;
class Oddoreven{
    public static void main(String args[]){
        int a;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        a=s1.nextInt();
        if (a%2==0){
            System.out.println(a+" is an even number.");
        }
        else{
            System.out.println(a+" is an odd number.");
        }
        s1.close();
    }
}