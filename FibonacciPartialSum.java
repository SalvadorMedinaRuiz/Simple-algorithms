import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
    	long currentNext;
        long sum = 0;
        long start = from % 60;
        long end = to % 60;
        
        if (end < start){
        	end += 60;
        }
    	long current = 0;
    	long next = 1;
    	
    	for (int i = 0; i <= end; i++) {
    		if ( i >= start) {
    			sum += current;
    		}
    		currentNext = next;
    		next += current;
    		current = currentNext;
    	}
        return (sum % 10);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}

