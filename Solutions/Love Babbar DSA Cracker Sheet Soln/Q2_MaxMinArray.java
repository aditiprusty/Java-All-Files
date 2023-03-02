import java.util.*;
public class Q2_MaxMinArray 
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
		int max=arr[0], min=arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max element = "+max);
		System.out.println("Min element = "+min);
	}

}
