import java.util.Scanner;
public class pattern_17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int c;
		for(int i=2*n;i>=1;i-=2)
		{
			c=64;
			for(int j=1;j<=i;j+=2)
			{
				System.out.print(" ");
			}
			for(int j=2*n;j>=i;j-=2)
			{
				c++;
				System.out.print((char)c);
			}
			for(int j=2*n;j>=i;j-=2)
			{
				c--;
				if(c>=65) 
				{
					System.out.print((char)c);
				}
			}
			System.out.println();
		}
	}
}
