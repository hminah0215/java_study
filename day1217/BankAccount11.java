class BankAccount
{
	private double balance;
	
	public void printBalance(){
		System.out.println( "�����ܾ�: " + balance);
	}

	public void deposit( int amount ){
		balance = balance + amount;
	}

	public void withdraw( int amount ){
		if(amount <= balance){
			balance -= amount;
		}else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
		
		/*if( amount > balance  ){
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		balance -= amount; 
		�̷��� �ص� ��.*/
	}
	//������
	public void setBalance( int balance ){
		this.balance = balance;
	}
	//������ 
	public double getBalance(){		
		return balance;
	}
	
	public void addInterest(){
		balance = balance * 1.075;
	}
}
class BankAccount11 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();

		a1.setBalance(100); //a1.setDeposit(100); �̹��� �̷��� �ص� ��.
		a2.setBalance(50);
		
		a1.withdraw(60);
		a2.withdraw(30);

		System.out.println( "�����ܾ�: "+a1.getBalance() );   //40 ���
		System.out.println( "�����ܾ�: "+a2.getBalance() );	//20���

		a1.printBalance(); //40���
		a2.printBalance(); //20���
		
		a1.addInterest();
		a2.addInterest();
		
		a1.printBalance(); //43 ���
		a2.printBalance(); //21.5��� 

		a1.withdraw(30);  //������ �Ͼ. 
		a1.withdraw(20);	 //������ �Ǽ� ������ �Ͼ�� ����. 
		a1.printBalance();  //13 ���
	}
}
