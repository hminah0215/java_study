import java.util.Scanner;

class NegativeBalanceException extends Exception
{
	public NegativeBalanceException(String msg){
		super(msg);
	}
}

class BankAccount
{
	 static int balance = 0; //잔액
	  int a;

	public static int deposit( int a ){ //입금
		balance	=	balance + a;
		return balance;
	}

	public static int withdraw( int b ) throws NegativeBalanceException{//출금
		balance = balance - b;
		
		if( b > balance ){
			throw new NegativeBalanceException("인출금액이 잔액보다 크므로 인출불가");
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
		
			System.out.print("입금할 금액을 입력하세요===>");
			money = sc.nextInt();
			BankAccount.deposit(money);
			System.out.println("잔액은 " + BankAccount.balance);
			
			System.out.print("출금할 금액을 입력하세요===>");
			money = sc.nextInt();
			System.out.println("잔액은 " + BankAccount.withdraw(money));

		}catch(NegativeBalanceException e){
			System.out.println("예외발생: " + e.getMessage());
		}
	}
}
}

