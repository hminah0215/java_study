import java.util.Scanner;

class NegativeBalanceException extends Exception
{
	public NegativeBalanceException(String msg){
		super(msg);
	}
}

class BankAccount
{
	 static int balance = 0; //�ܾ�
	  int a;

	public static int deposit( int a ){ //�Ա�
		balance	=	balance + a;
		return balance;
	}

	public static int withdraw( int b ) throws NegativeBalanceException{//���
		balance = balance - b;
		
		if( b > balance ){
			throw new NegativeBalanceException("����ݾ��� �ܾ׺��� ũ�Ƿ� ����Ұ�");
		}

		return balance;
	}
}

class  BankAccountTest
{
	public static void main(String[] args) 
	{
	while(true){
		try{
			int money;
			Scanner sc = new Scanner(System.in);
		
			System.out.print("�Ա��� �ݾ��� �Է��ϼ���===>");
			money = sc.nextInt();
			BankAccount.deposit(money);
			System.out.println("�ܾ��� " + BankAccount.balance);
			
			System.out.print("����� �ݾ��� �Է��ϼ���===>");
			money = sc.nextInt();
			System.out.println("�ܾ��� " + BankAccount.withdraw(money));

		}catch(NegativeBalanceException e){
			System.out.println("���ܹ߻�: " + e.getMessage());
		}
	}
}
}
