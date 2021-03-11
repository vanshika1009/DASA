//This projram allows you to traverse the matrix in a horizontal Wave starting from a[0][0] 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorizontalWave {
	
	static void print(int a[][])
	{
		int N = a.length;
		for (int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	static void Wave(int a[][])
	{
		int N = a.length;
		for(int i=0; i<N; i++)
		{
			if (i%2 == 0)
			{
				for (int j=0; j<N; j++)
				{
					System.out.print(a[i][j]+", ");
				}
				System.out.println();
			}
			else
			{
				for(int j=N-1; j>=0; j--)
				{
					System.out.print(a[i][j]+ ", ");
			
				}
				System.out.println();
			}
			
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Please enter the number of columns/rows of the matrix");
		int N = Integer.parseInt(br.readLine());
		
		int a[][] = new int[N][N];
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
				
			}
		}
		Wave(a);
		System.out.println();
		System.out.println();
		print(a);
	}
	
	
}
