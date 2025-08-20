package Array;

import java.util.Scanner;


public class EvenCheck 
{
	public static void main(String[] args) 
	{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the values in array ");
		   int[] a = {2,3,4,5,6,7};
		   for(int i=0; i<a.length; i++)
		   {
			   a[i]=sc.nextInt();
		   }
		    boolean flag=false;
		    for(int i=0; i<a.length; i++)
		    {
		    	if(a[i]%2==0)
		    	{
		    		System.out.println(a[i]);
		    		flag=true;
		 	    }
		    }
		   
	}
}
