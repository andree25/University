
import java.util.Scanner;

public class newtonLagrange {
	private static int n; // noduri
	private static double a; // aprox polinom
	private static double x[]; // sir noduri
	private static double l, sum, p, p1;

	public static double aprox(double x) {
		double ap = x * x - x + 1;
		return ap;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("n = ");
		n = sc.nextInt();
		System.out.println("x = ");
		x = new double[n];

		System.out.println("elementele sirului: ");
		for (int i = 0; i < n; i++)
			x[i] = sc.nextDouble();

		System.out.println(" aproximarea polinomului: ");
		a = sc.nextDouble();
		System.out.println("  ");
		l = aprox(x[0]);

		for (int i = 1; i < n; i++) {
			sum = 0;
			for (int j = 0; j < i; j++) {
				p = 1;
				for (int k = 0; k < i && k != j; k++) {
					p *= x[j] - x[k];
				}
				sum += aprox(x[i]) / p;
			}

			p1 = 1;
			for (int m = 0; m < i - 1; m++)
				p1 *= a - x[m];
			l += sum * p1;
		}
		System.out.println("rezultatul este = " + l);

		sc.close();
	}
}
