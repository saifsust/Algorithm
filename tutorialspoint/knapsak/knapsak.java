import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{


    private final int SIZE_OF_ARRAY = 1000;
    private int[][] matrix = new int[SIZE_OF_ARRAY][SIZE_OF_ARRAY];
    private int products[], priceOfProducts[], bagSize, numOfProducts, isProduct[];
    private  Scanner read;

    private void Knapsak() throws Exception
    {

        read = FileFactory.read();

        while(read.hasNext())
        {
            numOfProducts = read.nextInt();
            bagSize = read.nextInt();
            isProduct = new int[SIZE_OF_ARRAY];
            products = new int[numOfProducts + 1];
            priceOfProducts = new int[numOfProducts + 1];

            fresh();

            input();

            System.out.println(algorithm());

            show(numOfProducts);



        }

        read.close();

    }

    private int algorithm()
    {



        int sumOfProduct = 0;
        for(int i = 1; i <= numOfProducts; i++)
        {

            sumOfProduct += products[i];
            for(int j = 1; j <= bagSize; j++)
            {
                if(j<products[i])
                {
                    matrix[i][j]=matrix[i-1][j];
                }else{
                    matrix[i][j]=Math.max(matrix[i-1][j],matrix[i-1][j-products[i]]+priceOfProducts[i]);
                }
            }
        }

        return matrix[numOfProducts][bagSize];
    }


    private void input()
    {

        for(int i = 1; i <= numOfProducts; i++)
        {
            products[i] = read.nextInt();
            isProduct[products[i]] = 1;
            priceOfProducts[i] = read.nextInt();
        }

    }


    private void fresh()
    {
        Arrays.fill(isProduct, 0);
        for(int i = 0; i < SIZE_OF_ARRAY; i++)
        {
            Arrays.fill(matrix[i], 0);
        }
        System.out.println();
    }

    private void show(int numOfProducts)
    {
        System.out.println("\n\n");
        for(int i = 0; i <= numOfProducts; i++)
        {
            for(int j = 0; j <= bagSize; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }


    public static void main(String[] args)
    {


        try
        {
            new Main().Knapsak();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

}