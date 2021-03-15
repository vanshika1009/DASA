import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortMatrix {
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
		sort_matrix(a);
		
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
	
	static void sort_matrix(int a[][])
	{
		int n = a.length;
		int b[] = new int[n*n];
		
		int i,j, k=0; 
		for (i=0; i<n; i++)
		{
			for(j=0; j<n; j++, k++)
			{
				b[k] = a[i][j];
			}
		}
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		
		for (i=0, k=0; i<n; i++)
		{
			for(j=0; j<n; j++, k++)
			{
				a[i][j]=b[k];
			}
		}
		print(a);
	}
}
