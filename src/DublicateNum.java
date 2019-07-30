import java.util.Arrays;
import java.util.Scanner;

public class DublicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int n=s.nextInt();
		int a[]=new int[n];
	
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	
		int rep[]=new int[n];
		int i=0;
		int j=0;

		int rlen=1;
		Arrays.sort(a);
		while(i<n-1)
		{
			if(a[i]!=a[i+1])
			{
				
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
		
		System.out.println("Enter the number : ");
		int num=s.nextInt();
		int z=1;

		while(z<rlen)
		{	
			if(rep[z]%num==0)
			{
				System.out.print(rep[z]+" ");
			}
			z++;
		}
		s.close();
	}

}
