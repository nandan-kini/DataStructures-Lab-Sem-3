package javaprograms;

import java.util.*;
import java.util.LinkedList.*;
import java.util.Iterator;




public class Q12_Linkedlist{
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		LinkedList<String> ll = new LinkedList();
		
		System.out.println(" 1. Insert");
		System.out.println(" 2. Delete");
		System.out.println(" 3. Display");
		System.out.println(" 4. Display using iterator < 5");
		System.out.println(" 5. Exit!");
		
		while(true)
		{
			System.out.println(" enter your choice");
			int ch = sc.nextInt();
			sc.nextLine();
			
			switch(ch)
			{
			case 1:
				System.out.println(" enter the string u want to insert");
				String x = sc.nextLine();
				ll.add(x);
				break;
				
			case 2:
				System.out.println(" the string deleted is "+ll.remove(0));
				break;
				
			case 3:
				if(ll.peek()== null)
				{
					System.out.println(" list is empty");
				}
				else {
					
					System.out.println("the elements of list are");
					Iterator<String> itr = ll.iterator();
					while( itr.hasNext())
					{
						System.out.println(itr.next());
					}
				}
				break;
				
			case 4:
				String e;
				if(ll.peek()== null)
				{
					System.out.println(" list is empty");
				}
				else {
					System.out.println("the elements of list less than 5 are");
					Iterator<String> itr = ll.iterator();
					
					while(itr.hasNext())
					{
						e = itr.next();
						
						if(e.length()<5)
						{
							System.out.println(e);
						}
						
					}
				}
				break;
				
				
			case 5:
				sc.close();
				System.exit(0);
				break;
				
				
				
				
			}
		}
		
	}
}
