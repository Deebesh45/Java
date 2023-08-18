import java.util.Scanner;
import java.util.Arrays;
class Array01{
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        int n;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter no.of values:");
        n=s1.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter a"+i+" value");
            a[i]=s1.nextInt();
            System.out.println("Enter b"+i+" value");
            b[i]=s1.nextInt();
            c[i]=a[i]+b[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("+");
        System.out.println(Arrays.toString(b));
        System.out.println("=");
        System.out.println(Arrays.toString(c));
        s1.close();
    }
}