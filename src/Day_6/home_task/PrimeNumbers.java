package Day_6.home_task;

import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            scanner.close();
            return;
        }
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Output : None (Input must be greater than 0)");
            scanner.close();
            return;
        }

        System.out.print("Output : ");
        generateNPrimes(n);
        scanner.close();
    }

    public static void generateNPrimes(int n) {
        int count = 0;  
        int number = 2; 

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number);
                count++;


                if (count < n) {
                    System.out.print(",");
                }
            }
            number++;
        }
        System.out.println(); 
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}