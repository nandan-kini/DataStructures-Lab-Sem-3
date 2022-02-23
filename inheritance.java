package javaprograms;

import java.util.*;

abstract class vehicle
{
	int year_of_manufacture;
	
	vehicle()
	{
		this.year_of_manufacture =0;
	}
	
	vehicle(int a)
	{
		this.year_of_manufacture =a;
	}

		abstract int getdata();
		abstract void putdata(int a);
}

class TwoWheeler extends vehicle
{
	TwoWheeler()
	{
		super();
	}
	
	TwoWheeler(int a)
	{
		super(a);
	}
	
	int getdata()
	{
		return this.year_of_manufacture;
	}
	
	void putdata(int a)
	{
		this.year_of_manufacture = a;
	}
}


 final class FourWheeler extends vehicle
{
	FourWheeler()
	{
		super();
	}
	
	FourWheeler(int a)
	{
		super(a);
	}
	
	int getdata()
	{
		return this.year_of_manufacture;
	}
	
	void putdata(int a)
	{
		this.year_of_manufacture = a;
	}
}


class MyTwoWheeler extends TwoWheeler
{
	MyTwoWheeler()
	{
		super();
	}
	
	MyTwoWheeler(int a)
	{
		super(a);
	}
	
	
	
	void putdata(int a)
	{
		super.putdata(a);
	}
}


class inheritance
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		MyTwoWheeler mtw = new MyTwoWheeler();
		
		System.out.println(" enter the manufacture of your 2 wheeler");
		int a = sc.nextInt();
		
		mtw.putdata(a);
		
		System.out.println("  the manufacture of your 2 wheeler" + mtw.getdata());
		
		System.out.println(" enter the manufacture of your 4 wheeler");
		int b =sc.nextInt();
		
		FourWheeler fw = new FourWheeler (b);
		System.out.println("  the manufacture of your 4 wheeler" +fw.getdata());
		
	}
}