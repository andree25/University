
import java.util.Scanner;

public class difDivizate {

	private static float x[];
	private static float y[];
	private static float z[];
	private static float dDiv[];
	private static int n;

	private static Scanner sc = new Scanner(System.in);

	public static void difdiv() {
		dDiv[0] = y[0];

		for (int k = 0; k < n; k++) {
			for (int j = 0; j < n - k; j++) {
				z[j] = ((y[j + 1] - y[j]) / x[j + k] - x[j]);
			}

			for (int i = 0; i < n; i++)
				y[i] = z[i];
			dDiv[k + 1] = y[0];
		}

		for (int i = 0; i < n; i++)
			System.out.println(dDiv[i] + " ");

	}

	public static void main(String[] args) {

		System.out.println("n = ");
		n = sc.nextInt();

		x = new float[n];
		y = new float[n];
		z = new float[n];
		dDiv = new float[n];

		System.out.println(" noduri: ");
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextFloat();
		}

		System.out.println("y = ");
		for (int i = 0; i < n; i++)
			y[i] = sc.nextFloat();

		System.out.println(" rezultat: ");
		difdiv();
	}
}
