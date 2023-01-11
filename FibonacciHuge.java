import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long ceilingNum = (n % modLength(m));
        if (ceilingNum <= 0) {
        	return 0;
        }
        
        /////////////////////////Keep?
        long previous = 0;
        long current  = 1;

        for (long i = 0; i < ceilingNum - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % m;
        }
        ////////////////////////
        return current;
    }
    
    private static long modLength(long m) {
    	long length = 1;
    	long previousNum = 0;
    	long currentNum = 1;
    	while (true) {
    		long previousNum2 = previousNum;
    		previousNum = currentNum;
    		currentNum = (previousNum2 + currentNum) % m;
    		if (previousNum == 0 && currentNum == 1) {
    			break;
    		}
    		length++;
    	}
    	return length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

