package javaprograms;

import java.util.*;

class prime
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i,flag=0;
		System.out.println(" enter the number");
		 n = sc.nextInt();
		
		if(n<=1)
		{
			System.out.println(" Neither prime nor composite");
		}
		else {
			
			for ( i =2; i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag =1;
					break;
					
				}
				else {
					flag =0;
				}
			}
			if(flag ==0)
			{
				System.out.println(" prime");
			} else {
				System.out.println(" nor prime");
			}
		}
	}
}
