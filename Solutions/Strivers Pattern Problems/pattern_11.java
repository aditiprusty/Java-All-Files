import java.util.Scanner;
public class pattern_11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int c;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				c=0;
			else
				c=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				if(c==0)
					c=1;
				else
					c=0;
			}
			System.out.println();
		}
	}
}