import java.util.*;
class Main{

  private static int bigMod(int num,int pow ,int mod)
   {
   	if(pow==0) return 1;
   	int x= bigMod(num,pow/2,mod);
   	 x=(x%mod*x%mod)%mod;
   	 if(pow%2==1)x=(x%mod*num%mod)%mod;
   	 return x;

   }
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		while(read.hasNext())
		{

			int num =read.nextInt();
			int pow =read.nextInt();
			int mod = read.nextInt();
			System.out.println(bigMod(num,pow,mod));

		}
		read.close();



	}
}