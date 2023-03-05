import java.util.Scanner;
public class pattern_09
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=2*n;i>=1;i-=2)
		{
			for(int j=1;j<=i;j+=2)
			{
				System.out.print(" ");
			}
			for(int j=2*n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2*n;i>=1;i-=2)
		{
			for(int j=2*n;j>=i;j-=2)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
