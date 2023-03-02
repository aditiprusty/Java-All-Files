import java.util.*;
public class Q1_ReverseArray
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
		System.out.println("Original array :- ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0; i<arr.length/2;i++)
		{
			int c=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=c;
		}
		System.out.println();
		System.out.println("Reverse array :- ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
