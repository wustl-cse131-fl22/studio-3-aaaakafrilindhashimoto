package studio3;

import java.util.Scanner;

public abstract class Studio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		System.out.println("Input value for n: ");
		int n = in.nextInt();
		boolean [] number  = new boolean [n];
		
		
		for(int i=2; i< n; i++)
		{
			number[i] = true;
			
	
		}
		for (int j = 2; j < Math.sqrt(n); j++)
		{	if(number[j])
		{	
			for(int k = j*j; k<n; k= k+j)
			{ number[k] = false;
			
			}
		
			
		}
		}
		
		for(int p = 0;  p < n; p++)
		{
			if(number[p] == true)
			{System.out.println(p);
			
			}
			
			
		}
				
		
		
		
	}

}
