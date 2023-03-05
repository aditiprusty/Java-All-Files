import java.util.Scanner;
public class pattern_18
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int c;
		for(int i=64+n;i>=65;i--)
		{
			c=i;
			for(int j=64+n;j>=i;j--)
			{
				System.out.print((char)c+" ");
				c++;
			}
			System.out.println();
		}
	}
}
