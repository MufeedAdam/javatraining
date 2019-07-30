import java.util.Arrays;
import java.util.Scanner;

public class SortJoin {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the length of arrays : ");
		int n=s.nextInt();
		int[] arr1= new int[n];
		int[] arr2= new int[n];
		System.out.print(" Enter Array 1 :");
		for(int k=0;k<n;k++)
		{
			arr1[k]=s.nextInt();
		}
		System.out.print(" Enter Array 2 :");
		for(int k=0;k<n;k++)
		{
			arr2[k]=s.nextInt();
		}
		int arr3[]= new int[5];
		int i=0;
		while(i<arr1.length)
		{
			arr3[i]=arr1[i]*100+arr2[i];
			i++;
		}
		Arrays.sort(arr3);
		for(int x:arr3)
		{
			System.out.println(x);
		}
		s.close();
	}
}
