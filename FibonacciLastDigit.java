import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(long n) {
        long firstNumber = 0;
        long secondNumber = 1;
        long lastDigit = 0;
        
        for (int i = 2; i <= n; i++) {
        	lastDigit = (firstNumber + secondNumber) % 10;
        	firstNumber = secondNumber;
        	secondNumber = lastDigit;
        }

        return lastDigit;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

