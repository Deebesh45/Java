import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int choice;
        int radius = 0, length = 0, breadth = 0, height = 0, base = 0;
        float area;
        System.out.println("1.Circle 2.Triangle 3.Rectangle");
        choice = s1.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter radius of circle:");
                radius = s1.nextInt();
                area = (float) 3.14 * radius * radius;
                System.out.println("Area = " + area);
                break;
            case 2:
                System.out.println("enter height and base of triangle:");
                height = s1.nextInt();
                base = s1.nextInt();
                area = (float) 0.5 * height * base;
                System.out.println("Area = " + area);
                break;
            case 3:
                System.out.println("enter length and breadth of rectangle:");
                length = s1.nextInt();
                breadth = s1.nextInt();
                area = (float) length * breadth;
                System.out.println("Area = " + area);
                break;
            default:
                break;
        }
        s1.close();
    }
}
