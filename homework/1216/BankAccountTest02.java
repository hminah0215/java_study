//12�� 16�� ������ ���� ���α׷���5�� 
class BankAccount
{
	private String name;     //�̸�
	private String acc;			//���¹�ȣ
	private double money;			//�ܾ�
	private double eja;		//������

	//������ : ����������� ���� �ʱ�ȭ�� �������� ����ϴ� Ư���� �޼ҵ�. 
		//��絥���͸� �޴� ������
	public BankAccount( String name, String acc, double money,  double eja ){
		
		this.name = name;
		this.acc = acc;
		this.money = money;
		this.eja = eja;
	}
		//�����͸� �ϳ��� �����ʴ� ������
	public BankAccount(){
		
	}
	
	//������ : �����ؼ� ���� �����ϴ°�.
	public void setName( String name ){
		this.name = name;
	}
	public void setAcc( String acc ){
		this.acc = acc;
	}
	public void setMoney( double money ){
		this.money = money;
	}
	public void setEja( double eja ){
		this.eja = eja;
	}

	//������ : �����ؼ� ���� �о��.
	public String getName( ){
		return name;
	}
	public String getAcc( ){
		return acc;
	}
	public double getMoney( ){
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
		System.out.println("������: " + eja+"%" );	
	}
}


class BankAccountTest02
{
	public static void main(String[] args) 
	{
		BankAccount ba = new BankAccount("���ξ�","123-456-78900",500, 3.2);
		System.out.println("ù��° ������ ����");
		ba.info();
	
		System.out.println("============================");
		
		BankAccount ba2 = new BankAccount();
		System.out.println("�ι�° ������ ����");
		ba2.info();
		
		System.out.println("============================");
	
		BankAccount ba3 = new BankAccount();
		System.out.println("����° ������ ����");
		ba3.info();


	}
}