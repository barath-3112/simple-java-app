import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        // Optimization: check up to the square root
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}
