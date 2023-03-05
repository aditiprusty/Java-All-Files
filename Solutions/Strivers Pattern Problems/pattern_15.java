import java.util.Scanner;
public class pattern_15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=65+n-1;i>=65;i--)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
