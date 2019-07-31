
public class employee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=0, experience=0;
		String name="",company="";
		name=args[0];
		company=args[1];
		experience=Integer.parseInt(args[2]);
		salary=Integer.parseInt(args[3]);
		System.out.println(" Employee Name : "+name+"\nCompany Name : "+company+"\nsalary : "+salary+"\nexperience : "+experience);
		System.out.println("Credit : "+(salary/3)+"\nLoan : "+(salary/4));
		if(experience>=2 && experience<4)
		{
			System.out.println("Promotion : Team Head");
		}
		else if(experience>=4 && experience<8)
		{
			System.out.println("Promotion : Project Manager");
		}
		else if(experience>8)
		{
			System.out.println("Promotion : BDM");
		}
		else
		{
			System.out.println("Promotion : Sorry :)");
		}
		
		
	}

}
