import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortRightDiagnal 
{
	public static void main(String agrs[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the size of the array");
		int n = Integer.parseInt(br.readLine());
		
		int a[][] = new int[n][n];
		System.out.println("Start entering the elements of matrix");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++) 
			{
				a[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		print(a);
		System.out.println();
		right_diagnal(a);
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
	
	static void right_diagnal(int a[][])
	{
		int i, j;
		int b[] = new int[a.length];
		
		for (i=0; i<a.length; i++)
		{
			for (j=0; j<a[i].length; j++)
			{
				if((i+j) == 2)
				{
					b[i] = a[i][j];
				}
			}
		}
				Arrays.sort(b);
				for (i=0; i<a.length; i++)
				{
					for (j=0; j<a[i].length; j++) 
					{
						if((i+j) == 2) 
						{
							a[i][j] = b[i];
						}
					}
				}
			print(a);
	}
}
