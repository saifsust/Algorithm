package CoinChange;

import java.util.ArrayList;
import java.util.List;

public class minCoinChange {

	public static void main(String[] args) {
		int coin[] = { 3, 1, 2 };
		System.out.println(new coinChange().coinCalculation(10, coin));
	}

}

class coinChange {
	private int[][] M = new int[1000][1000];
	private final int inf = (int) 1e9;
	private List<Integer> coins = new ArrayList<>();

	public int coinCalculation(int amount, int coin[]) {
		for (int i = 0; i <= amount; i++) {
			M[0][i] = inf;
			M[1][i] = -1;
		}
		M[0][0] = 0;
		for (int i = 0; i < coin.length; i++) {
			for (int j = coin[i]; j <= amount; j++) {
				if (coin[i] <= j) {

					if (M[0][j] > 1 + M[0][j - coin[i]]) {
						M[0][j] = 1 + M[0][j - coin[i]];
						M[1][j] = i;
					}
					// M[0][j] = Math.min(M[0][j], 1 + M[0][j - coin[i]]);
				}
			}
		}

		print(amount, M[1], coin);

		return M[0][amount];
	}

	private void print(int amount, int M[], int coin[]) {

		List<Integer> list = new ArrayList<>();
		list = findCoins(amount,M,coin);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	private List<Integer> findCoins(int amount, int[] M,int[] coin) {
		if (M[amount] == -1)
			return coins;
		coins.add(coin[M[amount]]);
		return findCoins(amount - coin[M[amount]], M,coin);
	}
}