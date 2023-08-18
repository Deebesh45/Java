import java.util.Scanner;
class Minof2{
    public static void main(String[] args) {
        int a,b;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter A: ");
        a=s1.nextInt();
        System.out.println("Enter B: ");
        b=s1.nextInt();
        if(a<b){
            System.out.println("A is smaller.");
        }
        else{
            System.out.println("B is smaller.");
        }
    s1.close();
    }
    
}