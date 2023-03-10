import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
	if (b == 0) {
		return a;
	}
	int primeA = a % b;
	return gcd_naive(b, primeA);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
