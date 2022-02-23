package javaprograms;
import java.util.*;

public class person
{
		String name;
		int age;
		String education;
		float salary;
		float basic ;
		float hra;
		float da;
		int yoe;
		int number_of_loans;
		float loan_amt[];
		
		person(String name,int age,String education,float basic,int yoe,int number_of_loans,float loan_amt[])
		{
			this.name=name;
			this.age =age;
			this.education=education;
			this.basic = basic;
			this.hra = (float)(basic*0.5);
			this.da = basic*6;
			this.yoe = yoe;
			this.number_of_loans = number_of_loans;
			this.loan_amt= new float [number_of_loans];
			this.loan_amt=loan_amt;
			
					
		}
		
		public void iseligible()
		{
			if((basic+hra+da>500000)&&(number_of_loans<=3))
			{
				System.out.println(" yes");
			}
			else
			{
				System.out.println(" no");
			}
		}
		
		
		public void iseligiblepromotion()
		{
			if((age>45)&&(yoe>15))
			{
				System.out.println(" yes");
			}
			else
			{
				System.out.println(" no");
			}
		}
		
		public void taxpay(person p)
		{
			double sal = p.basic +p.hra+ p.da;
			if(salary>5000000)
			{
				System.out.println("Tax to be paid is"+0.2*sal);
				
			}
			else {
				
				System.out.println(" no tax to be paid");
			}
		}
		
		public static void  display (person p)
		{
			 System.out.println(" Name is"+p.name);
			 System.out.println(" Age is"+p.age);
			 System.out.println(" education is"+p.education);
			 System.out.println(" salary  is"+p.basic + p.hra +p.da);
			 System.out.println(" experience is"+p.yoe);
			 System.out.println(" number of loans is"+p.number_of_loans);
			 
			 System.out.println(" loan amount is");
			 for(int i =0; i<p.number_of_loans;i++)
			 {
				 System.out.println(p.loan_amt[i] +"");
			 }
			 
			 p.iseligible();
			 p.taxpay(p);
			 p.iseligiblepromotion();
			 
		}
		 
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		

		System.out.println(" Enter your name ");
		 String name = sc.nextLine();
		
		System.out.println(" Age  is");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println(" Enter your education ");
		String education= sc.nextLine();
		
		System.out.println(" salary   is");
		float basic = sc.nextFloat();
		
		System.out.println(" years of experience  is");
		int yoe = sc.nextInt();
		
		System.out.println(" number of loans  is");
		int number_of_loans = sc.nextInt();
		
		float loan_amt[] = new float [number_of_loans];
		for(int j=0;j<number_of_loans;j++)
		{
			System.out.println(" enter the loan amount");
		    loan_amt[j] = sc.nextFloat();
		}
		person p = new person(name,age,education,basic, yoe,number_of_loans,loan_amt);
		display( p);
	}
		
}
