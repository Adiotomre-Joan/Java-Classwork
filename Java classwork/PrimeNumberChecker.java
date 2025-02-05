import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        
        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
