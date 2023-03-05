import java.util.Scanner;
public class pattern_12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int c;
		for(int i=n;i>=1;i--)
		{
			c=0;
			for(int j=n;j>=i;j--)
			{
				c=c+1;
				System.out.print(c);
			}
			for(int j=1;j<(2*i)-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(c);
				c=c-1;
			}
			System.out.println();
		}
	}
}
