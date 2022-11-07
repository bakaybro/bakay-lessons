import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((num % 10) + (num / 10) % 10 + (num / 100));

    }

    private static void getSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);

    }
}
