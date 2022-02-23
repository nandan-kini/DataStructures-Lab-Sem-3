package javaprograms;

import java.util.*;
class fibonacci{
public static void main(String [] args)
{
	Scanner sc = new Scanner (System.in);
	
	System.out.println(" enter the number of terms");
	int n = sc.nextInt();
	
	int a =0,b=1,c=1;
	int i =0 ;
	
	while(n>i) {
		
		System.out.println(a +"");
		c=a+b;
		a=b;
		b=c;
		i++;
	}
	
}
}
