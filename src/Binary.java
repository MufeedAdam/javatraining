
public class Binary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Integer alpha=23, cosmo=134;
	System.out.println("Before :\nCosmo : "+cosmo+" Alpha : "+alpha);
	cosmo^=alpha;
	alpha^=cosmo;
	cosmo^=alpha;
	System.out.println("After :\nCosmo : "+cosmo+" Alpha : "+alpha);
	}

}
