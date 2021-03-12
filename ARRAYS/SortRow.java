import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortRow 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int rows, columns;
		System.out.println("Enter the order of matrix" );
		rows = Integer.parseInt(br.readLine());
		columns = Integer.parseInt(br.readLine());
		
		int a[][] = new int[rows][columns];
		for (int i=0; i<rows; i++)
		{
			for (int j=0; j<rows; j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		print(a);
		System.out.println();
		sort(a);
			
	}
	static void sort(int a[][])
	{
		//int n = a.length;
		for(int i=0; i<a.length; i++)
		{
			Arrays.sort(a[i]); // Here we are treating the matrix as an array of arrays. therefore taking every row at a time
		}
		print(a);
		
	}
	
	static void print(int a[][])
	{
		int N = a.length;
		for (int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}
	}
	
	
}
