import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n, m = 0;
        System.out.println("Enter a number for multiplication table:");
        n = s1.nextInt();
        for (int i = 0; i < 10; i++) {
            m = n * (i + 1);
            System.out.println(n + "x" + (i + 1) + "=" + m);
        }

        s1.close();
    }

}
