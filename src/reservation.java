import java.util.Scanner;


public class reservation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bus=1;
		int seat=1;
		int fare=0;
		int amount=0;
		int[] seats=new int[]{0,0,0,0};
		int[] total=new int[]{0,0,0,0};
		Scanner s=new Scanner(System.in);
		while(bus<=4)
		{	seat=1;
			System.out.print("Enter The bus "+bus+" fare : ");
			fare=s.nextInt();
			while(seat<=7)
			{
				System.out.println("Enter the Amount Passenger "+seat+" : ");
				amount=s.nextInt();
				if(amount>=fare)
				{
					seats[bus-1]=seats[bus-1]+1;
					total[bus-1]=total[bus-1]+fare;
					System.out.println("You Can travel");
				}
				else
				{
					System.out.println("You cannot travel");
				}
				seat++;
			}
			bus++;
		}
		int full=0;
		bus=1;
		while(bus<=4)
		{	System.out.println("Bus : "+bus);
			System.out.println("The seats filled are : "+seats[bus-1]+" amount : "+total[bus-1]);
			full=full+total[bus-1];
			bus++;
		}
		System.out.println("Total : "+full);
		
	}

}
