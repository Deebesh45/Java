import java.util.Scanner;

public class Days2Months {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int days, months = 0;
        System.out.println("Enter no of days:");
        days = s1.nextInt();
        while (days >= 30) {
            if (days >= 30) {
                months += 1;
                days -= 30;
            }
        }
        System.out.println("Months: " + months + " Days: " + days);
        s1.close();
    }

}
