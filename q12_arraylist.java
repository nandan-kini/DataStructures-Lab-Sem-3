package javaprograms;

import java.util.*;
import java.util.ArrayList;

public class q12_arraylist{
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner( System.in);
		ArrayList<String> q = new ArrayList();
		
		System.out.println("1. enqueue");
		System.out.println("2. dequeue");
		System.out.println("3. display");
		System.out.println("4. exit");
		
		while(true)
		{
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch)
			{
			case 1:
				System.out.println(" enter the string to be inserted");
				String x = sc.nextLine();
				
				q.add(q.size(),x);
				break;
				
			case 2:
				System.out.println(" string deleted is  " +q.remove(0));
				break;
				
			case 3:
				if(q.isEmpty())
				{
					System.out.println("queue is empty");
				}
				else {
					System.out.println(" the elements of array are");
					for(int i =0; i<q.size();i++)
					{
						System.out.println(q.get(i));
					}
				}
				break;
				
			case 4:
				sc.close();
				System.exit(0);
				
			}
		}
	}
}
