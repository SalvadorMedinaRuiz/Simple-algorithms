import java.util.*;

public class FibonacciSumSquares {//very similar to previous problems!
    private static long getFibonacciSumSquaresNaive(long n) {
    	n %= 60;
    	long current2;
        long sum = 0;
        long current = 0;
        long next = 1;
        for (int i = 0; i < n; i++) {
        	current2 = next;
        	next = (current + next)%10;
        	current = current2;
        }
        sum = (current * next) % 10;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumSquaresNaive(n);
        System.out.println(s);
    }
}

