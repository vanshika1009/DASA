import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NinetyDegreeRotate {
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the size of the matrix");
		int n = Integer.parseInt(br.readLine());
		
		int a[][] = new int[n][n];
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		print(a);
		System.out.println();
		rotate(a);
		
	}
	
	
	static void print(int a[][])
	{
		int N = a.length;
		for (int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	static void rotate(int a[][])
	{
		//this program is a mixture of 2 operations i.e transpose and mirroring of a matrix
		int n = a.length;
		int b[][] = new int[n][n];
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				b[j][n-1-i] = a[i][j];
			}
		}
		
		print(b);
	}
}
