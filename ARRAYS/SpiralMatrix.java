import java.util.Scanner;

public class SpiralMatrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
		//print (a);
		
		spiral (a);
		
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
	
	static void spiral(int a[][])
	{
		int N= a.length;
		int i=0, j=0, k=1; 
		int X1=0, X2=a.length-1, Y1=0, Y2=a.length-1;
		
		outer_loop: //this is called labeling in java. You can practically label anything
		while(true)
		{
      
      //MOVING RIGHT
			for (j=X1; j<=X2; j++)
			{
				a[i][j] = k++;
				if (k>N*N)
				{
					break outer_loop;
				}
			}
			j--;
			Y1++;//ADJUSTING THE BOUNDARY
			
			//MOVING DOWN
			for(i=Y1; i<=Y2; i++)
			{
				a[i][j] = k++;
				if (k>N*N)
				{
					break outer_loop;
				}
			}
			i--;
			X2--;//ADJUSTING THE BOUNDARY
			
      //MOVING LEFT
			for (j=X2; j>=X1; j--)
			{
				a[i][j] = k++;
				if (k>N*N)
				{
					break outer_loop;
				}
			}
			j++;
			Y2--;//ADJUSTING THE BOUNDARY 
			
      
     //MOVING UP
			for (i=Y2; i>=Y1; i--)
			{
				a[i][j]= k++;
				if(k> N*N)
				{
					break outer_loop;
				}
			}
			i++;
			X1++;
		}
		print (a);
	}
}
