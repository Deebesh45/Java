public class SumofEven {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0 && i % 4 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
