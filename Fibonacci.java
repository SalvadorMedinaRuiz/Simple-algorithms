import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
	if (n == 0) {
		return 0;
	}
    int fibonacciArray[] = new int[n+1];
    fibonacciArray[0] = 0;
    fibonacciArray[1] = 1;
    for (int i = 2; i < n+1; i++) {
    	fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
    }
    return fibonacciArray[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
