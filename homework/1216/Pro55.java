class BankAccount
{
	//private String name;     //�̸�
	//private String acc;			//���¹�ȣ
	//private int money;			//�ܾ�
	//private double eja;		//������

	public String bankAccount( String name, String acc){
		String z =  name;
		String x =  acc;
		String q = z +" " +"\n"+"���¹�ȣ: "+ x;
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
		System.out.println( ba.bankAccount("���ξ�","123-456-78900"  ) );
		System.out.println( ba.bankAccount( 500 ) );
		System.out.println( ba.bankAccount( 3.2)+"%" );
	
		BankAccount ba2 = new BankAccount();
		
		}
	}

