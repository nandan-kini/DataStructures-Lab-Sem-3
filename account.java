package javaprograms;
import java.util.*;

public class account{
	
	int accno;
	String name;
	int phoneno;
	float balance_amt;
	
	Scanner sc = new Scanner(System.in);
	
	public void getinput()
	{
		System.out.println(" enter the name");
		 name = sc.nextLine();
		
		System.out.println(" enter the accno");
		accno = sc.nextInt();
		
		System.out.println(" enter the phoneno");
		 phoneno = sc.nextInt();
		
	    balance_amt =0;  
		
	}
	
	public void deposit()
	{
		System.out.println(" enter the amount to be deposited");
		int deposit = sc.nextInt();
		
		balance_amt += deposit;
		
		System.out.println(" deposit succesfull..balance is"+balance_amt);
	}
	
	public void withdraw()
	{
		System.out.println(" enter the amount to be withdrawn");
		int withdraw = sc.nextInt();
		
		if(balance_amt - withdraw >= 0)
		{ 
			balance_amt = balance_amt-withdraw;
			System.out.println(" withdraw succesfull");
		}
		else {
			
			System.out.println("Insufficient fund");
		}
		System.out.println(" balance amount is"+balance_amt);
	}
	
	public void printdetails()
	{
		System.out.println(" name is"+name);
		System.out.println(" acc no is"+accno);
		System.out.println(" phone no  is"+ phoneno);
		System.out.println(" balanceamt is"+ balance_amt);
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		account a1 = new account();
		
		System.out.println(" 1. Enter the details");
		System.out.println(" 2. Deposit");
		System.out.println(" 3. Withdraw");
		System.out.println(" 4. Print details");
		System.out.println(" 5.Exit");
		
		while(true)
		{
			System.out.println(" Enter your choice");
			int ch = sc .nextInt();
			
			switch(ch)
			{
			case 1:
				a1.getinput();
				break;
				
			case 2:
				a1.deposit();
				break;
				
			case 3:
				a1.withdraw();
				break;
				
			case 4:
				a1.printdetails();
				break;
				
			case 5:
				sc.close();
				System.exit(0);
				
			}
		}
		
	}
			
			
}