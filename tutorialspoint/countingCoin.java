import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{

    private final int N = 1000;
    private int[][] matrix = new int[N][N];
    private int[] coins;
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
            for(int i = 1; i <= numOfCoins; i++)
            {
                coins[i] = read.nextInt();
            }

            //for(int i=0;i<=numOfCoins;i++)System.out.print(coins[i]+" ");
            refresh();


            System.out.println(algorithm(numOfCoins,numOfSum));


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
            if(i == 0)Arrays.fill(matrix[i], INF);
            else
                Arrays.fill(matrix[i], 0);
        }
    }
    private int algorithm(int numOfCoins, int numOfSum)
    {

        for(int i = 1; i <= numOfCoins; i++)
        {

            for(int j = 0; j <= numOfSum; j++)
            {
                if(coins[i] == j)matrix[coins[i]][j] = 1;
                else
                {
                    if(j<coins[i])
                    {
                        matrix[coins[i]][j]=matrix[coins[i-1]][j];
                    }else{
                        matrix[coins[i]][j]=Math.min(matrix[coins[i]][j-coins[i]]+1,matrix[coins[i-1]][j]);
                    }

                }
            }

        }
        return matrix[coins[numOfCoins]][numOfSum];

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