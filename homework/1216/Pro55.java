class BankAccount
{
	//private String name;     //ÀÌ¸§
	//private String acc;			//°èÁÂ¹øÈ£
	//private int money;			//ÀÜ¾×
	//private double eja;		//ÀÌÀÚÀ²

	public String bankAccount( String name, String acc){
		String z =  name;
		String x =  acc;
		String q = z +" " +"\n"+"°èÁÂ¹øÈ£: "+ x;
		return q ;
		
	}

	public int bankAccount( int money){
		int c = money;
		return c ;
	}
	public double bankAccount( double eja){
		double v = eja;
		return v;
	}
		public BankAccount(){
		
	}

	
}



class Pro55 
{
	public static void main(String[] args) 
	{
		BankAccount ba = new BankAccount();
		System.out.println( ba.bankAccount("Çö¹Î¾Æ","123-456-78900"  ) );
		System.out.println( ba.bankAccount( 500 ) );
		System.out.println( ba.bankAccount( 3.2)+"%" );
	
		BankAccount ba2 = new BankAccount();
		
		}
	}

