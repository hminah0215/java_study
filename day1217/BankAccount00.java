//��ü�� Ŭ���� �ǵ� ���� 3�� 

class BankAccount		
{
	private int balance;		//�ܾ��� ǥ���ϴ� ����
	private int deposit;
	private int withdraw;


	//������
	public BankAccount(int balance){
		
	}
	public BankAccount( int deposit, int withdraw, int balance ){
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;	
		
	}

	
	//������
	public void setDeposit(int amount){		//����, ���Ը޼ҵ�
		this.balance = deposit + amount;
	}
	public void setWithdraw(int amount){		//����,�������� �޼ҵ� 
		this.balance = balance - withdraw;
	}
	public void setBalance(int balance){		//�����ܰ�
		this.balance = balance;
	}
	//������ 
	public int getDeposit(){		
		return balance;
	}
	public int getWithdraw(){		
		return balance;
	}
	public int getBalance(){		//������ �ܰ� ��ȯ�ϴ� �޼ҵ� 
		return balance;
	}
}

class  BankAccount00
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();

		a1.setBalance(100);
		a2.setBalance(50);
		a1.setWithdraw(60);
		a2.setWithdraw(30);
	
		System.out.println(a1);
		System.out.println(a1.getBalance());	
		System.out.println(a2.getBalance());
		
	}
}
