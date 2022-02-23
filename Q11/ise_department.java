package ise;

import q10.*;
import java.util.*;

public class ise_department implements department{
	
	Scanner sc = new Scanner(System.in);
	faculty f = new faculty();
	
	int y,p;
	
	public void readdata()
	{	

		System.out.println(" enter your age");
		f.age = sc.nextInt();
		sc.nextLine();
		System.out.println(" enter your name");
		f.name = sc.nextLine();
		
		
		try {
			 if(f.age>58)
				 throw new AgeException();
		}
		catch(AgeException e) {
			System.out.println(e);
		}
		sc.nextLine();
		
		System.out.println(" enter your designation");
		f.designation= sc.nextLine();
		
		System.out.println(" enter your joining date");
		f.joining_date = sc.nextLine();
		System.out.println(" enter your subjects handled");
		f.subjects_handled = sc.nextLine();
		
		
		System.out.println(" enter your years of experience");
		f.yoe = sc.nextInt();
		
		y= f.yoe;
		
		System.out.println(" enter number of research paper");
		p = sc.nextInt();
		
		
		
	}
	
	public void printdata()
	{
		System.out.println(" Name is"+f.name);
		System.out.println(" Age is"+f.age);
		System.out.println(" Subjects handled is"+f.subjects_handled);
		
	}
	
	public void print_number_designations()
	{
		System.out.println(" Number of designations are"+f.designation);
	}
	
	public void number_research_consultancy_projs()
	{
		System.out.println(" Number of designations are"+p);
	}
	public int year()
	{
		return y;
	}
}

class AgeException extends Exception{
	public String toString() {
		 return "age>58 not allowed";
	}
}