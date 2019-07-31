
public class Selection {

	/**
	 * @param args
	 */
	
	public static void sort(String[] str)
	{
		int pos=0,com=0; String temp=null;
		while(pos<str.length)
		{
			com=pos+1;
			while(com<str.length)
			{
				if(str[pos].compareTo(str[com])>0)
				{
					temp=str[pos];
					str[pos]=str[com];
					str[com]=temp;
				}
				com++;
			}
			pos++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] orgs= {"Shubham", "zeerthan", "namith", "mufeed"};
		Selection.sort(orgs);
		for(String s: orgs)
		{
			System.out.println(s);
		}
	}

}
