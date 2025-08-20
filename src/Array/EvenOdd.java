package Array;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		int[] input = {2,6,3,8,7,4};
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for(int no : input)
		{
			if(no%2==0)
			{
				even.add(no);
			}
			else
			{
				odd.add(no);
			}
		}
		List<Integer> output = new ArrayList<>(even);
		output.addAll(odd);
		System.out.println("Output : " +output);
		
		
	}
}
