import java.util.Random;


public class OTP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder build = new StringBuilder();
		Random r=new Random();
		int digit=1;
		while(digit<=4)
		{
			build.append(r.nextInt(10));
			digit++;
		}
		System.out.println("Your OTP is : "+build.toString());
	}

}
