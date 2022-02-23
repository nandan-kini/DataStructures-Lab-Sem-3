package javaprograms;

import java.util.*;

public class strings{
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1. Extract a part of string ");
		System.out.println(" 2. ocurreneces ");
		System.out.println(" 3. replace ");
		System.out.println(" 4.  alphabetical order");
		System.out.println(" 5. compare ");
		System.out.println(" 6.  cocatenate");
		System.out.println(" 7. exit ");
		
		while(true)
		{
			System.out.println(" enter your choice");
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
			
			case 1:
				System.out.println(" enter your string");
				String s = sc.nextLine();
				
				
				System.out.println(" enter the position ");
				int n = sc.nextInt();
				
				System.out.println(" enter the number of letter");
				int m = sc.nextInt();
				
				String k = s.substring(n-1,n+m-1);
				System.out.println(" required string is "+k);
				break;
				
			case 2:
				System.out.println(" enter your string");
				 s = sc.nextLine();
				
				System.out.println(" enter the word whose occurence is to be found");
				 k = sc.nextLine();
				
				int count =0;
				String arr[] = s.split("");
						
						for(int i =0; i< arr.length;i++)
						{
							if(arr[i].equals(k))
							{
								count++;
							}
						}
						
				System.out.println(" ocurreneces are"+count);
				break;
				
			case 3:
				System.out.println(" enter your string");
				s = sc.nextLine();
				
				System.out.println(" enter the string to be replaced");
				k = sc.nextLine();
				
				System.out.println(" enter your string to be replaced with");
				String p = sc.nextLine();
				
				String t = s.replace(k, p);
				System.out.println(" replaced string is"+t);
				
				break;
				
			case 4:
				System.out.println(" enter your string");
				s = sc.nextLine();
				
				t = s.toLowerCase();
				char arr2[] = t.toCharArray();
				
				Arrays.sort(arr2);
				k = new String(arr2);
				System.out.println(" replaced string is"+k);
				break;
				
			case 5:
				System.out.println(" enter your string 1");
				s = sc.nextLine();
				
				System.out.println(" enter your string 2");
				k = sc.nextLine();
				
				boolean cmp = s.equalsIgnoreCase(k);
				
				if(cmp)
				{
					System.out.println(" two strings are equal");
				}
				else {
					System.out.println(" they are not equal");
				}
				break;
				
			case 6:
				System.out.println(" enter your string 1");
				s = sc.nextLine();
				
				System.out.println(" enter your string 2");
				k = sc.nextLine();
				
				t = s+ "" +k;
				System.out.println(" concatenated string is"+t);
				break;
				
			case 7:
				sc.close();
				System.exit(0);
				
				
				
				
				
				
				
				
				
				
				
			}
		}
	}
	
}

