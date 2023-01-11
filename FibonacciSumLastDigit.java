import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        n = (n+2) % 60;
        long fibonacciArray[] = new long[(int) (n+1)];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i <= n; i++) {
        	fibonacciArray[i] = (fibonacciArray[i-1] % 10 + fibonacciArray[i-2] % 10) % 10;
        }
        if (fibonacciArray[(int) n] == 0) {
        	return 9;
        }

        return (fibonacciArray[(int) n] % 10 -1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumNaive(n);
        System.out.println(s);
    }
}

