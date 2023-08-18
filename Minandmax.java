import java.util.Scanner;

public class Minandmax {
    public static void main(String[] args) {
        int a[] = new int[5];
        int t1=0,t2=0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        for (int i = 0; i < 5; i++) {

            a[i] = s1.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for(int j=i+1;j<5;j++){
                if (a[i] < a[j]) {
                a[0] = a[i];
                t1=a[i];
            }
            
            if (a[i] > a[j]) {
                a[4] = a[i];
                t2=a[i];
            }
            
            }

            
        }
        System.out.println("Minimum of all numbers is:" + t1);
        System.out.println("Maximum of all numbers is:" + t2);
    }
}
