import java.util.Scanner;
class Oddorevens{
    public static void main(String args[]){
        int a,b;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter a number:");
        a=s1.nextInt();
        b=a%2;
        switch (b) {
            case 0:
                System.out.println("Even number");
                break;
        
            default:
                System.out.println("Odd number.");
                break;
        }
    s1.close();    
    }
}