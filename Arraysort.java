import java.util.Scanner;

public class Arraysort {
    public static void main(String[] args) {
        int temp, n;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter no of variables:");
        n = s1.nextInt();
        int a[] = new int[100];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = s1.nextInt();
        }
        System.out.println("Sorted list:");
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (a[j] > a[k]) {
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
            System.out.println(a[j]);
        }
        s1.close();

    }

}
