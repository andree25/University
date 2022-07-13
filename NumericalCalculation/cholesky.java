
import java.util.Scanner;
import java.lang.Math;

public class cholesky {
	private static double k[][];
	private static double a[][];

	private static int n;
	private static double x = 0;

	private static Scanner sc = new Scanner(System.in);

	public static void kCholesky() {
		k[0][0] = Math.sqrt(a[0][0]);
		k[1][0] = (a[1][0] / k[0][0]);
		k[1][1] = (a[1][1] - Math.pow(k[1][0], 2));
		for (int i = 2; i < n; i++) {
			k[i][1] = (a[i][1] / k[1][1]);
			for (int j = 1; j < i - 1; j++) {
				for (int s = 0; s < j - 1; s++)
					x += k[i][s] * k[j][s];
				k[i][j] = ((a[i][j] - x) / k[j][j]);
				x = 0;
			}
			for (int s = 0; s < i - 1; s++)
				x += Math.pow(k[i][i], 2);
			k[i][i] = Math.sqrt(a[i][i] - x);
		}
	}

	public static void main(String[] args) {

		System.out.println("n = ");
		n = sc.nextInt();

		k = new double[n][n];
		a = new double[n][n];

		System.out.println("matrice: ");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextDouble();

		System.out.println("rezultat: ");
		kCholesky();
	}
}
