import java.util.*;
public class Q4_012Array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter array elements 0 or 1 or 2");
		for(int i=0; i<arr.length;i++)
		{
			int n=sc.nextInt();
			if(n==0||n==1||n==2)
				arr[i]=n;
			else
			{
				System.out.println("Enter array elements 0 or 1 or 2");
				arr[i]=n;
			}
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
