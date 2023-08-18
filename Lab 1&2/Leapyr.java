import java.util.Scanner;

public class Leapyr {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year;
        year = s1.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year is a leap year.");
        }

        s1.close();
    }
}
