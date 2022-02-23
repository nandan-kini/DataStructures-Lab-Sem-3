package javaprograms;
import java.util.*;

public class bubblesort {
 public static void main(String [] args)
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println(" enter the size of array");
	 int n = sc.nextInt();
	 int array[] = new int[n];
	 
	 System.out.println(" enter th elements into array");
	 for( int i=0;i<n;i++)
		 array[i]=sc.nextInt();
	 
	 for(int i=0;i<n;i++)
	 {
		 for(int j=1;j<n-i;j++)
		 {
			 if(array[j]<array[j-1])
			 {
				 int temp = array[j];
				 array[j]=array[j-1];
				 array[j-1]=temp;
			 }
		 }
	 }
	 System.out.println(" sorted array is ");
	 for(int i=0;i<n;i++)
	 {
		 System.out.println(array[i]);
	 }
	 
 }
}
