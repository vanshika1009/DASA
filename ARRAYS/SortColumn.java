import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortColumn 
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Please enter the size of the matrix");
		int n = Integer.parseInt(br.readLine());
		
		
		int i,j;
		int a[][] = new int[n][n];
		System.out.println("Start entering the elements");
		for(i=0; i<n; i++)
		{
			for (j=0; j<n; j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		print(a);
		System.out.println();
		columnsort(a);
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
	
	static void columnsort(int a[][])
	{
		int i, j;
		int b[] = new int[a.length];
		
		for(i=0; i<a.length; i++)
		{
			for(j=0; j<a[i].length; j++)
			{
				b[j] = a[j][i];
			}
			Arrays.sort(b);
			for(j=0; j<a[i].length; j++)
			{
				a[j][i] = b[j];
			}
			
			
		}
		print(a);
		}
	}

