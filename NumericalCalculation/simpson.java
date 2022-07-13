
import java.util.Scanner;

public class simpson {
	private static Scanner sc = new Scanner(System.in);

	private static double a;
	private static double b;
	private static double m;
	private static double sp = 0; // suma indici pari
	private static double si = 0; // suma indici impari
	private static double fA;
	private static double fB;
	private static int n;

	public static void main(String[] args) {

		System.out.println("a (capat interval) = ");
		a = sc.nextDouble();

		System.out.println("b (capat interval) = ");
		b = sc.nextDouble();

		System.out.println("m (nr de puncte) = ");
		m = sc.nextDouble();

		System.out.println("n = ");
		n = sc.nextInt();

		System.out.println("f(a) = ");
		fA = sc.nextDouble();

		System.out.println("f(b) = ");
		fB = sc.nextDouble();

		double h = (b - a) / m;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				sp += 2 * (a + i * h);
			if (i % 2 != 0)
				si += 2 * (a + i * h);
		}

		System.out.println("rezultat: " + ((b - a) / (2 * m)) * (fA + sp + si + fB));
	}
}