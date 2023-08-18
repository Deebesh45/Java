import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n;
        System.out.println("Enter a 3 digit number:");
        n = s1.nextInt();
        int temp = n;
        int p = 0;
        while (n > 0) {
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        } else {
            System.out.println(
                    "No. It is not an Armstrong No.");
        }
        s1.close();
    }
}
