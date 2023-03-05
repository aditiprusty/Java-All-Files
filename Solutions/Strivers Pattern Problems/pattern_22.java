import java.util.Scanner;
public class pattern_22
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=2*n;i>=1;i-=2)
		{
			for(int k=2*n;k>i;k-=2)
			{
				System.out.print(k/2+" ");				
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(i/2+" ");
			}
			int c=i+2;
			for(int k=2*n;k>i;k-=2)
			{
				if(i<2*n)
					System.out.print(c/2+" ");
				c=c+2;
			}
			System.out.println();
		}
		for(int i=2;i<2*n;i+=2)
		{
			for(int k=2*n;k>i+1;k-=2)
			{
				System.out.print(k/2+" ");				
			}
			for(int j=2;j<i+1;j++)
			{
				System.out.print((i+2)/2+" ");
			}
			int c=i+2;
			for(int k=2*n;k>i+1;k-=2)
			{
				if(i<2*n)
					System.out.print(c/2+" ");
				c=c+2;
			}
			System.out.println();
		}
	}
}
