import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;



public class Intersection_array {
	
	public static void main (String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n,m;
		System.out.println("Please enter the length of array"); //Array 1
		n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		
		System.out.println("Enetr the elements");
		for (int i=0; i<n; i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Please enter the length of array"); //Array 2
		m = Integer.parseInt(br.readLine());
		int b[] = new int[m];
		System.out.println("Enetr the elements");
		for (int i=0; i<m; i++)
		{
			b[i]=Integer.parseInt(br.readLine());
		}
		
		ArrayList<Integer> arr = new ArrayList<Integer>(); //array 3 beacuse we dont know the size of the third array
		
		if(m>n) {
			for (int i=0; i<m; i++)
			{
				for (int j=0; j<n; j++)
				{
					if (b[i] == a[j])
					{
						arr.add(b[i]);
					}
				}
		}
		
		}
		
		else 
		{
			for (int i=0; i<n; i++)
			{
				for (int j=0; j<m; j++)
				{
					if (a[i] == b[j])
					{
						arr.add(a[i]);
					}
				}
		}
		}
		for (int i : arr) {
		      System.out.println(i);
	}
}
}
