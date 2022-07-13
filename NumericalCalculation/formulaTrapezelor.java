
import java.util.Scanner;

public class formulaTrapezelor {
	private static Scanner sc = new Scanner(System.in);

	private static double a;
	private static double b;
	private static double m;
	private static double sum = 0;
	private static int n;
	private static double fA;
	private static double fB;

	public static void main(String[] args) {

		System.out.println("a (capat interval) = ");
		a = sc.nextDouble();

		System.out.println("b (capat interval) = ");
		b = sc.nextDouble();

		System.out.println("m (nr de puncte) = ");
		m = sc.nextDouble();

		System.out.println("n = ");
		n = sc.nextInt();

		fA = sc.nextDouble();
		fB = sc.nextDouble();

		double h = (b - a) / m;
		for (int i = 1; i <= n; i++) {
			sum += 2 * (a + i * h);
		}
		System.out.println("f(x) = " + ((b - a) / 2 * m) * (fA + sum + fB));
	}
}
