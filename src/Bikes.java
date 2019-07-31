import java.util.Scanner;


public class Bikes {

	/**
	 * @param args
	 */
	static int ind;
	static int x;
	static Scanner s=new Scanner(System.in);
	public static void add(int[] fuel){
		int index=0;
		while(index<fuel.length)
		{
			System.out.println(" Enter the Milage : ");
			fuel[index]=s.nextInt();
			index++;
		}
		
	}
	
	public static void traverse(int[] week)
	{
		if(ind>=week.length)
		{
			return;
		}
		else
		{
			System.out.println(week[ind]);
			ind++;
			traverse(week);
		}
	}
	public static void check(int[] money)
	{
		if(x>=money.length)
		{
			return;
		}
		else
		{
			if(money[x]>20 && money[x]<50)
			{
				money[x]=25;
				System.out.print("Replace : ");
			}
				
			System.out.println(money[x]);
			x++;
			check(money);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] milage=new int[15];
		add(milage);
		System.out.println("Traverse : ");
		traverse(milage);
		System.out.println("Change if required : ");
		check(milage);
		
	}

}
