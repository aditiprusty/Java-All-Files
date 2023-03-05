import java.util.*;
public class pattern_21
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n;k++)
			{
				if(i==1||i==n)
					System.out.print("*");
				else
				{
					if(k==1||k==n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
