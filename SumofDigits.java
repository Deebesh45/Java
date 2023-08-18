import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n, p = 0;
        n = s1.nextInt();
        while (n > 0) {
            int rem = n % 10;
            p = (p) + rem;
            n = n / 10;
        }
        System.out.println("Sum of digits= " + p);
        s1.close();
    }
}
