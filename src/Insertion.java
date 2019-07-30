
public class Insertion {

	public static void sort(String str)
	{
		byte[] b=str.getBytes();
		int i=0;
		int temp=0;
		while(i<b.length)
		{	temp=b[i];
			b[i]=(byte)(temp>>3);
			i++;
		}
		System.out.println(new String(b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String domain="ComputerNetworks";
		sort(domain);
	}

}
