package javaprograms;

import java.util.*;

class fibonaccir{
	
	public static int fibonaccirec(int n)
	{
		if(n==0) {
			return 0;
		}
		
		if(n==1 || n==2) {
			return 1;
		}
		
		return fibonaccirec(n-1) + fibonaccirec(n-2);
			
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter the number of terms");
		int count = sc.nextInt();
		
		System.out.println(" fibonacci series is");
		for(int i =0; i<count;i++)
		{
			System.out.println(fibonaccirec(i));
		}
		
		
	}
}