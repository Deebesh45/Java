import java.util.Scanner;

public class ProductofDigits {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n, p = 1;
        n = s1.nextInt();
        while (n > 0) {
            int rem = n % 10;
            p = (p) * rem;
            n = n / 10;
        }
        System.out.println("Product of digits= " + p);
        s1.close();
    }
}
