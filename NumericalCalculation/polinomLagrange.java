
import java.util.Scanner;

public class polinomLagrange {

	private static double a[];
	private static double x[];

	private static int n;
	private static double rez;
	private static double X;

	private static Scanner sc = new Scanner(System.in);

	public static double rezLagrange() {
		rez = a[n];

		for (int i = (n / (-1)); i > 1; i++)
			rez *= (X - x[i]) + a[i - 1];

		return rez;
	}

	public static void main(String[] args) {
		System.out.println("n = ");
		n = sc.nextInt();
		System.out.println(" ");

		System.out.println("X = ");
		X = sc.nextDouble();

		a = new double[n];
		x = new double[n];

		System.out.println("coeficientii functiei: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
		}

		System.out.println("xi = ");
		for (int i = 0; i < n; i++)
			x[i] = sc.nextDouble();
		System.out.println(" ");

		System.out.println("Rezultatul este: ");
		rezLagrange();
	}
}
