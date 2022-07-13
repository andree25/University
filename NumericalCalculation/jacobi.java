
import java.util.Scanner;

public class jacobi {
	private static int n;
	private static double nr = 0, nrMaxIt = 1000, ok = 0, eps = 1 / 1000, max = -Double.MAX_VALUE;
	private static double x[];
	private static double y[];
	private static double a[][];
	private static double b[];
	private static double sumAijXj, sumAijXj1;

	private static Scanner sc = new Scanner(System.in);

	public static double maxXiYi(double x[], double y[]) {
		for (int i = 0; i < n; i++)
			if (Math.abs(x[i] - y[i]) > max)
				max = x[i] - y[i];
		return max;
	}

	public static void main(String[] args) {

		System.out.println("n = ");
		n = sc.nextInt();

		x = new double[n];
		y = new double[n];
		a = new double[n][n];
		b = new double[n];

		System.out.println(" matrice: ");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextDouble();
			}

		System.out.println(" vector trm liberi: ");
		for (int i = 0; i < n; i++)
			b[i] = sc.nextDouble();

		System.out.println("aproximare: ");
		for (int i = 0; i < n; i++)
			x[i] = sc.nextDouble();

		System.out.println(" rezultat:  ");
		for (int i = 0; i < n; i++) {
			sumAijXj = 0;
			for (int j = 0; j < n; j++)
				sumAijXj += a[i][j] * x[j];
			b[i] = sumAijXj;
		}
		do {
			for (int i = 0; i < n; i++) {
				sumAijXj1 = 0;
				for (int j = 0; j < n && j != i; j++) {
					sumAijXj1 += a[i][j] * x[j];
				}
				y[i] = (1 / a[i][i]) * (b[i] - sumAijXj1);
			}
			nr++;
			if (maxXiYi(x, y) < eps)
				ok = 1;
			for (int i = 0; i < n; i++)
				x[i] = y[i];
		} while (nr < nrMaxIt && ok == 0);
		for (int i = 0; i < n; i++)
			System.out.println(y[i]);
	}
}
