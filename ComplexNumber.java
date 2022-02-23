package javaprograms;

import java.util.*;

class complex
{
	int a;
	int b;
	
	complex()
	{
		this.a=0;
		this.b=0;
	}
	 Scanner sc = new Scanner (System.in);
	
	public void getinput()
	{
		System.out.println(" enter the real part of complex number");
		 a = sc.nextInt();
		
		System.out.println(" enter the imaginary part of complex number");
		 b = sc.nextInt();
		
	}

	public  complex sum_c(complex c1,complex c2)
	{
		complex c3 = new complex();
		
		c3.a =c1.a +c2.a;
		c3.b= c1.b +c2.b;
		return c3;
	}
	
	public  complex diff_c(complex c1,complex c2)
	{
		complex c3 = new complex();
		
		c3.a =c1.a -c2.a;
		c3.b= c1.b -c2.b;
		return c3;
	}
	
	public  complex product_c(complex c1,complex c2)
	{
		complex c3 = new complex();
		
		c3.a =(c1.a *c2.a) -(c1.b * c2.b);
		c3.b= (c1.a * c2.b) + (c1.b*c2.a);
		return c3;
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1.addition ");
		System.out.println(" 2.substraction ");
		System.out.println(" 3.multiplication ");
		System.out.println(" 4. Exit ");
		
		complex c1 = new complex();
		complex c2 = new complex();
		complex compute = new complex();
		
		while(true)
		{
			System.out.println(" enter your choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println(" enter the first number");
				c1.getinput();
				
				System.out.println(" enter the second number");
				c2.getinput();
				
				compute = compute.sum_c(c1,c2);
				System.out.println(compute.a + "+i" +compute.b);
				break;
			
			case 2:
				System.out.println(" enter the first number");
				c1.getinput();
				
				System.out.println(" enter the second number");
				c2.getinput();
				
				compute = compute.diff_c(c1,c2);
				System.out.println(compute.a + "+i" +compute.b);
				break;
				
			case 3:
				System.out.println(" enter the first number");
				c1.getinput();
				
				System.out.println(" enter the second number");
				c2.getinput();
				
				compute = compute.product_c(c1,c2);
				System.out.println(compute.a + "+i" +compute.b);
				break;
				
			case 4:
				sc.close();
				System.exit(0);
				
				
			}
			
		}
		
	}
}
