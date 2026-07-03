package Day_1;



public class Reversenumber {

    public static void main(String[] args) {
        int num = 123;  // Change this to any 3-digit number
        int reversed = 0;

        // Extract digits using % and /
        int digit1 = num % 10;        // Last digit: 123 % 10 = 3
        int digit2 = (num / 10) % 10;  // Middle digit: 12 % 10 = 2
        int digit3 = num / 100;       // First digit: 123 / 100 = 1

        // Form reversed number
        reversed = digit1 * 100 + digit2 * 10 + digit3;

        System.out.println("Original number: " + num);
        System.out.println("Reversed number: " + reversed);
    }
} 
    

