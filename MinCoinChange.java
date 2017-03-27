public class MinCoinChange {
	

	public int minCoinDynamic(int amount, int[] coins) {
		int[] coinReq = new int[amount+1]; 
		int[] CC = new int[coins.length]; 
		coinReq[0] = 0; 

		for (int amt = 1; amt <= amount; amt++) {
			for (int j = 0; j < CC.length; j++) {
				CC[j] = -1;
			}
			
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= amt) { 
					CC[j] = coinReq[amt - coins[j]] + 1; 
				
				}
			}
			coinReq[amt]=-1;
			for(int j=0;j<CC.length;j++){
				if(CC[j]>0 && (coinReq[amt]==-1 || coinReq[amt]>CC[j])){
					coinReq[amt]=CC[j];
				}
			}
		}
		return coinReq[amount];
		
	}

	public static void main(String[] args) {
		int[] coins = { 1,2,3 };
		int amount = 5;
		MinCoinChange m = new MinCoinChange();		
		System.out.println("(Dynamic Programming) Minimum Coins required to make change for "
				+ amount + " are: " + m.minCoinDynamic(amount, coins));
	}

}