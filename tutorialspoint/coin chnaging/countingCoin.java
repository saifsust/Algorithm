import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{

    private final int N = 10000;
    private int[][] matrix = new int[N][N];
    private int[] coins;
    private int counter ;
    private final int INF = 1000000000;

    private   void coinChange() throws Exception
    {
        Scanner read = FileFactory.read();//new Scanner(System.in);


        while(read.hasNext())
        {

            int numOfCoins = read.nextInt();
            int numOfSum = read.nextInt();


            coins = new int[numOfCoins + 1];

            //  System.out.println(numOfCoins);

            coins[0] = 0;
            for(int i = 0; i < numOfCoins; i++)
            {
                coins[i] = read.nextInt();
            }

            //for(int i=0;i<=numOfCoins;i++)System.out.print(coins[i]+" ");
            refresh();
            counter=0;
            System.out.println(countingCoins(coins, numOfCoins - 1, numOfSum));
            System.out.println("REC Counter : "+counter);
            counter = 0;
            System.out.println(optimalCountingCoins(coins, numOfCoins - 1, numOfSum));
             System.out.println("OPT Counter : "+counter);
            
            //showMatrix(numOfCoins, numOfSum);


        }
        read.close();


    }

    private void showMatrix(int numOfCoins, int numOfSum)
    {
        System.out.println();
        for(int i = 0; i <= numOfCoins; i++)
        {
            for(int j = 1; j <= numOfSum; j++)
            {
                System.out.print(matrix[coins[i]][j] + "  ");
            }
            System.out.println();
        }

    }

    private void refresh()
    {
        for(int i = 0; i < matrix.length; i++)
        {
            Arrays.fill(matrix[i], 0);
        }
    }



    private int optimalCountingCoins(int Coins[], int index, int num)
    {
        // System.out.println(index);
        counter++;
        if(num == 0) return 1;
        if(num < 0) return 0;
        if(index < 0) return 0;
        if(matrix[Coins[index]][num] != 0 ) return matrix[Coins[index]][num];
        matrix[Coins[index]][num] = optimalCountingCoins(Coins, index, num - Coins[index]) + optimalCountingCoins(Coins, index - 1, num);
        return  matrix[Coins[index]][num];


    }

    private int countingCoins(int Coins[], int index, int num)
    {
        counter++;
        if(num == 0)   return 1;
        if(num < 0)    return 0;
        if(index < 0)  return 0;

        return countingCoins(Coins, index, num - Coins[index]) + countingCoins(Coins, index - 1, num);

    }

    public static void main(String[] argv)
    {

        try
        {


            new Main().coinChange();

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }


    }
}