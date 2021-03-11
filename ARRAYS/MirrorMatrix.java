//This program is to accept an N X N matrix and create its mirror image
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MirrorMatrix 
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		int n, m;
		System.out.println("Enter the number of rows of the matrix");
		n = Integer.parseInt(br.readLine());
		System.out.println("Enter the number of columns of the matrix");
		m = Integer.parseInt(br.readLine());
		
		int arr[][]= new int[n][m];
		System.out.println("Please enter the elements N X M matrix");
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<m; j++)
			{
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<m; j++)
			{
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
		
		//mirroring logic
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<m; j++)
			{
				
				System.out.print(arr[i][n-1-j] + ", ");
			}
			System.out.println();
		}
		
	}
}
