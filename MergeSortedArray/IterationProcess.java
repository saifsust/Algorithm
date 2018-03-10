import java.util.*;
import java.lang.*;
import java.io.*;
public class IterationProcess

{

    public static void main(String[] args)
    {
        int arr1[] = {1, 2, 3, 4, 4};
        int arr2[] = {2, 4, 5, 5, 6};
        int arr[] = merge(arr1, arr2);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    private static  int[] merge(int arr1[], int arr2[])
    {
        int arr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] <= arr2[j])
                arr[k++] = arr1[i++];
            else arr[k++] = arr2[j++];
        }


        if(i >= arr1.length)
        {
            while(j < arr2.length)
            {
                arr[k++] = arr2[j++];
            }
        }
        if(j >= arr2.length)
        {
            while(i < arr1.length)
            {
                arr[k++] = arr1[i++];
            }
        }


        return arr;

    }


}