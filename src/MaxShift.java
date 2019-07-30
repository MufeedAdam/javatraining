import java.util.Scanner;

public class MaxShift {
	

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
		int i=0,j=0;
		int min=arr1[i];
		
		while(i<arr1.length)
		{
			if(arr1[i]<min)
				min=arr1[i];
			i++;
		}
		System.out.println("Min : "+min);
		i=0;
		while(i<arr1.length)
		{
			j=0;
			while(j<arr2.length)
			{
				if(arr1[i]==arr2[j])
				{
					arr1[i]=0;
					arr2[j]=0;
				}
				j++;
			}
			i++;
		}
		i=0;
		int great=arr1[i];
		while(i<arr1.length)
		{
			if(arr1[i]>great)great=arr1[i];
			i++;
		}
		
		i=0;
		while(i<arr2.length)
		{
			if(arr2[i]>great)great=arr2[i];
			i++;
		}
		
		System.out.println("Great : "+great);
		System.out.println("Result : "+(great<<min));
		s.close();
	}

}
