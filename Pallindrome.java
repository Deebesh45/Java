import java.util.Scanner;

public class Pallindrome {

    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);

        int r, sum = 0, temp;
        int n = 0;
        System.out.println("Enter a number:");
        n = s1.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
        s1.close();
    }
}
