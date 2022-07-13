
import java.util.Scanner;

public class factorizareLU {
	private static int n;
	private static double a[][];
	private static double l[][];
	private static double u[][];
	private static int sum;
	private static Scanner sc = new Scanner(System.in);

	public static void lu() {
		for (int i = 0; i < n; i++) {
			// U
			for (int k = i; k < n; k++) {

				sum = 0;
				for (int j = 0; j < i; j++)
					sum += (l[i][j] * u[j][k]);
				u[i][k] = a[i][k] - sum;
			}
			// L
			for (int k = i; k < n; k++) {
				if (i == k)
					l[i][i] = 1;
				else {
					sum = 0;
					for (int j = 0; j < i; j++)
						sum += (l[k][j] * u[j][i]);
					l[k][i] = (a[k][i] - sum) / u[i][i];
				}
			}
		}

		System.out.println("L:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(l[i][j] + " ");
			System.out.println("");
		}
		System.out.println("  ");
		System.out.println("U:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(u[i][j] + " ");
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		System.out.println("n linii/coloane = ");
		n = sc.nextInt();

		a = new double[n][n];
		l = new double[n][n];
		u = new double[n][n];

		System.out.println("scrie matricea sistemului: ");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextDouble();
		System.out.println(" ");
		lu();

	}
}
