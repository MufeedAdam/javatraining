
public class Bubble {

	/**
	 * @param args
	 */
	
	public static void sort(String strs)
	{	byte[] str=strs.getBytes();
		int n=str.length;
		int i=0,j=0;
		byte temp=0;
		while(i<n-1)
		{	j=0;
			while(j<n-1)
			{
				if(str[j]>str[j+1])
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
				j++;
			}
			i++;
		}
		System.out.println(new String(str));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String described="DataScience";
		
		
		
		sort(described);
		System.out.println(described);
		
		
	}

}
