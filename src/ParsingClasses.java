
public class ParsingClasses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		int deposited=0,months=0;
		double interest=0;
		char type='\0';
		deposited=Integer.parseInt(args[0]);
		months=Integer.parseInt(args[1]);
		interest=Float.parseFloat(args[2]);
		type=args[3].charAt(0);
		deposited+=(deposited*(months*interest))/100;
		System.out.println("Account details : "+type+" "+interest+" "+months+" "+deposited);
	}

}
