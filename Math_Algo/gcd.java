
import java.util.*;
import java.lang.*;

 class Main{

private static int GCD(int a,int b)
{
   if(a==0) return b;
   return GCD(b%a,a);

}

public static void main(String[] args) throws Exception
{
   Scanner read = new Scanner(System.in);
   while(read.hasNext())
   {

   	  int a=read.nextInt();
   	  int b=read.nextInt();
        int numB=Math.max(a,b);
        int numA= Math.min(a,b);
   	  System.out.println(GCD(numA,numB));

     
   }

   read.close();
}

}