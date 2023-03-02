import java.util.Arrays;
import java.util.Scanner;

public class Q5_NegativePositiveArray {

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
		
		int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(arr[left]<0)
                left++;
            while(arr[right]>0)
                right--;
            if(left>=right)
                break;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println("After sorting :-");
        
        for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
