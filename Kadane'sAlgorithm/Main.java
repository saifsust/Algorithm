import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main(String[] args)
    {

        Scanner read = FileFactory.read();

        while(read.hasNext())
        {

            int size = read.nextInt();
            int[] nums = new int[size];
            for(int i = 0; i < size; ++i) nums[i] = read.nextInt();

            System.out.println("Kadane's Algorithm " + maxSumOfSubArray(nums));


        }
        read.close();

    }
    // kadane's Algorithm

    private static int maxSumOfSubArray(int[] nums)
    {

        int max_sum = nums[0], temp_sum = 0;

        for(int i = 0; i < nums.length; ++i)
        {
            temp_sum += nums[i];
            if(max_sum < temp_sum)max_sum = temp_sum;
            if(temp_sum < 0) temp_sum = 0;
        }

        return max_sum;
    }

}
