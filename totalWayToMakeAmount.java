package CoinChange;

import java.util.Arrays;
import java.util.Collections;

public class totalWayToMakeAmount {

	public static void main(String[] args) {
		int[] coins = { 3, 1, 2};
		System.out.println(new coinChanges().maximumWayToMakeTheAmount(20, coins));
	}

}

class coinChanges {

	int[][] dp = new int[100][100];

	public int maximumWayToMakeTheAmount(int amount, int[] coins) {
		//Arrays.sort(coins);
		for (int i = 0; i < dp.length; i++)
			Arrays.fill(dp[i], 0);
		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= amount; j++) {
				if (coins[i - 1] == j) {
					/*
					 * if coin== amount then bottom== up + 1
					 */
					dp[i][j] = 1 + dp[i - 1][j];
				} else {
					if (coins[i - 1] > j) {
						/*
						 *  if coins > amount then bottom=up
						 */	
						dp[i][j] = dp[i - 1][j];
					} else {
						/*
						 *  if coin < amount then bottom = up+ (bottom's amount-coin Position Value)
						 */
						dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
					}
				}
			}
		}

		return dp[coins.length][amount];
	}
}
