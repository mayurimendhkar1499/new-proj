package Array;

import java.util.Scanner;

public class EvenOddCheck 
{
	public static void main(String[] args) 
	{
		  
		  int a[]= {2,3,6,5,4,7}; 
		
		  for(int i=0; i<a.length-1; i++)
		  {
			  if(a[i]%2==0 )
			  {
				  
			  }	
			  else if(a[i]!=0 && a[i+1]%2==0) {
				 int temp=a[i];
				 a[i+1]=temp;
				 a[i]=a[i+1];
			  }
			  
		  }
		  for(int x:a) {
				 System.out.println("x::"+x);
			 }

		 
	}
}
