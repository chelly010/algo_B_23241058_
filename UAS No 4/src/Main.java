import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms of series: ");
        int n = scanner.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Number " + i + " " + (1.0 / i));
            sum += 1.0 / i;
        }
            System.out.println("sum: " + sum);
    }
}