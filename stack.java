package javaprograms;

import java.util.*;

class stack
{
	int top;
	int size;
	int stack[];
	
	stack(int top,int size)
	{
		this.top =top;
		this.size=size;
		this.stack = new int[size];
	}
	
	public void push(int ele)
	{
		if(top == size -1)
		{
			System.out.println(" Overflow");
		}
		else {
			stack[++top]=ele;
		}
	}
	
	public int pop()
	{
		if(top == -1)
		{
			return -1;
		}
		else {
			return stack[top--];
		}
	}
	
	public void display()
	{
		if(top == -1)
		{
			System.out.println(" stack is empty");
		}
		else {
			System.out.println(" contenets os=f stck are");
			for(int i =0; i<=top;i++)
			{
				System.out.println(stack[i]);
			}
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter the size of stack");
		int size =sc.nextInt();
		
		stack s1 = new stack(-1,size);
		
		System.out.println(" 1. push");
		System.out.println(" 2. pop");
		System.out.println(" 3. display");
		System.out.println(" 4. exit");
		
		while(true)
		{
			System.out.println(" enter your choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println(" enter the element to be inserted");
				int ele1 =sc.nextInt();
				s1.push(ele1);
				break;
				
			case 2:
				int ele2 = s1.pop();
				
				if(ele2 == -1)
				{
					System.out.println(" nothing to delete");
					
				}
				else {
					System.out.println(" item deleted is "+ele2);
				}
				break;
				
			case 3:
				s1.display();
				break;
				
			case 4:
				sc.close();
				System.exit(0);
				
			}
		}
		
	}
}