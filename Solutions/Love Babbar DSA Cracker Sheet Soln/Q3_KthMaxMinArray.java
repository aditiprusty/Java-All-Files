import java.util.*;
public class Q3_KthMaxMinArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter kth number");
		int k=sc.nextInt();
		Arrays.sort(arr);
		System.out.println("kth Max element = "+arr[arr.length-k]);
		System.out.println("kth Min element = "+arr[k-1]);
	}

}
