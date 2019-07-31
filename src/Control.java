import java.util.Scanner;


public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String model="";
		System.out.print("Please enter model : ");
		model=s.next();
		switch(model)
		{		
		case "R15"		: 
						System.out.println("Please enter the year of registration : ");
						int date=s.nextInt();
						int price=0;
						if(date>=2016)
						{	price=75000;
							System.out.println("There are one owner of price "+price);
							
							
						}
						else
						{	price=65000;
							System.out.println("There are one owner of price "+price);
						}
						if(price>=75000)
						{	float interest=10.0F,monthly=0.0F;;
							System.out.print("Do you want an EMI - yes/no : ");
							String emi=s.next();
							if(emi.equals("yes") || emi.equals("YES") ||emi.equals("Yes"))
							{
								monthly=price+((price*interest)/100);
								monthly/=36;
								System.out.println("The EMI will be "+monthly+" per month");
							}
							else
							{
								System.out.println("Total Price to be paid : "+price);
							}
							
						}
						else
						{
							System.out.println("No EMI Available");
						}
						
					      
						  break;
		case "Enfield"	: System.out.println("There are two owner of price 67000");
						  break;
		case "Avenger"	: System.out.println("There are five owner of price 275000");
						  break;
		case "Splender"	: System.out.println("There are three owner of price 175000");
						  break;
		default			: System.out.println("Sorry");
		}
		s.close();
	}

}
