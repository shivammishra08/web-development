import java.io.*;

class patten {
	
	public static void main(String args[])
	{
		
		int n = 4, i, j, num = 1, gap;

		gap = n - 1;

		for ( j = 1 ; j <= n ; j++ )
		{
		num = j;
		
		for ( i = 1 ; i <= gap ; i++ )
			System.out.print(" ");
		
		gap --;
		
		for ( i = 1 ; i <= j ; i++ )
		{
			System.out.print(num);
			num++;
		}
		num--;
		num--;
		for ( i = 1 ; i < j ; i++)
		{
			System.out.print(num);
			num--;
		}
		System.out.println();
		}
	}
}