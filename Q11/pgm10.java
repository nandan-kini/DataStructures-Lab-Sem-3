package q10;
import q10.*;
import ise.*;
import java.util.*;

class pgm10
{
	public static void main(String [] args) 
	{
	Scanner sc = new Scanner (System.in);
	ise_department is= new ise_department();
	
	int key=0,count =0;
	
	System.out.println(" enter the number of employees");
	int e = sc.nextInt();
	
	for(int i=0;i<e;i++)
	{


		System.out.println(" enter the details");

		is.readdata();
		
		int j=is.year();
		
		if(j>20)
		count++;
		
	while(true)
	{
		System.out.println("1 . print details");
		System.out.println("2 . number of designations");
		System.out.println("3 . number of research projects");
		System.out.println("4 . next employee");
		key = sc.nextInt();
		
		if(key==1)
			is.printdata();
		if(key==2)
			is.print_number_designations();
		if(key==3)
			is.number_research_consultancy_projs();
		if(key==4)
			break;
	}

	
	}
	System.out.println(" number of yoe > 20 is"+count);
	}	
}