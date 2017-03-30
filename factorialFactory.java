package Programming;

import java.util.Arrays;

public class factorialFactory {

	private static int up = 1, low = 1;
	private static int[][] BC = new int[100][100];
	private static int[] _factorial_Dp = new int[1000];

	private static int _co_factorial(int n, int m) {
		if (n == m || m == 0)
			return 1;
		up *= n;
		low *= n - m;
		_co_factorial(n - 1, m);
		return up / low;
	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	private static int _binomial_Coefficient(int n, int m) {
		for (int i = 0; i <= n + 2; i++)
			BC[i][0] = 1;
		for (int i = 1; i <= n + 2; i++)
			BC[i][i] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				BC[i][j] = BC[i - 1][j - 1] + BC[i - 1][j];
			}
		}

		return BC[n][m];
	}

	public static void main(String[] args) {

		System.out.println(factorial(4));
		System.out.println(_co_factorial(10, 6));
		int n = 4, m = 2;
		System.out.println(_binomial_Coefficient(n, m));
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print(BC[i][j] + " ");
			}
			System.out.println();
		}
	}

}
