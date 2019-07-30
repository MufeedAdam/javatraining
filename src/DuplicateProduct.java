import java.util.Arrays;
import java.util.Scanner;

public class DuplicateProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int dup[]=new int[n];
		int rep[]=new int[n];
		int i=0;
		int j=0;
		int len=0;
		int rlen=1;
		Arrays.sort(a);
		while(i<n-1)
		{
			if(a[i]!=a[i+1])
			{
				dup[j++]=a[i];
				len+=1;
			}
				
			else
			{	
				if(rep[rlen-1]!=a[i])
				{
					rep[rlen]=a[i];
					rlen+=1;
				}	
			}
			i++;
		}
		dup[j++]=a[n-1];

		int z=0;
		while(z<=len)
		{	System.out.print(dup[z]+" ");
			z++;
		}
		System.out.println();
		z=1;
		int prod=1;
		while(z<rlen)
		{	System.out.print(rep[z]+" ");
			prod*=rep[z];
			z++;
		}
		System.out.println();
		System.out.println("Product :"+prod);
		
		s.close();
	}

}
