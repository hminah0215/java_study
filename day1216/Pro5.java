//12�� 16�� ������ ���� ���α׷���5�� 
class BankAccount
{
	private String name;     //�̸�
	private String acc;			//���¹�ȣ
	private int money;			//�ܾ�
	private double eja;		//������

	//������
		//��絥���͸� �޴� ������
	public BankAccount(String name, String acc, int money,  double eja ){
		
		this.name = name;
		this.acc = acc;
		this.money = money;
		this.eja = eja;
	}
		//�����͸� �ϳ��� �����ʴ� ������
	public BankAccount(){
		
	}
	
	//������
	public void setName( String name ){
		this.name = name;
	}
	public void setAcc( String acc ){
		this.acc = acc;
	}
	public void setMoney( int money ){
		this.money = money;
	}
	public void setEja( double eja ){
		this.eja = eja;
	}

	//������
	public String getName( ){
		return name;
	}
	public String getAcc( ){
		return acc;
	}
	public int getMoney( ){
		return money;
	}
	public double getEja( ){
		return eja;
	}

	//���
	public void info(){
		System.out.println("������ �̸�: " + name );
		System.out.println("���¹�ȣ: " + acc );
		System.out.println("���� �ܾ�: " + money );
		System.out.println("������: " + eja );	
}


class Pro5 
{
	public static void main(String[] args) 
	{
		BankAccount ba = new BankAccount("���ξ�","123-456-78900",500, 3.2);
		ba.info();
	}
}