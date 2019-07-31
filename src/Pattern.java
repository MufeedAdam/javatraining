
public class Pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=4;
		int i=4;
		int j=4;
		char c='A';
		int row=1;
		int ch=(int)c;
		while(i>=1)
		{	j=4;
			if(i==2)
			{
				c='c';
				ch=(char)c;
			}
			while(j>0)
			{	
				if(j<=row)
				{
					System.out.print(c);
					
				}
				else
				{
					System.out.print(" ");
				}
						
						ch=ch+i;
						c=(char)ch;
						j--;
			}
			System.out.println();
			i--;
			row++;
			
		}
	}

}
