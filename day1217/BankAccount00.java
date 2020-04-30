//객체와 클래스 피디엪 랩의 3번 

class BankAccount		
{
	private int balance;		//잔액을 표시하는 변수
	private int deposit;
	private int withdraw;


	//생성자
	public BankAccount(int balance){
		
	}
	public BankAccount( int deposit, int withdraw, int balance ){
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;	
		
	}

	
	//설정자
	public void setDeposit(int amount){		//저금, 예입메소드
		this.balance = deposit + amount;
	}
	public void setWithdraw(int amount){		//인출,예금인출 메소드 
		this.balance = balance - withdraw;
	}
	public void setBalance(int balance){		//현재잔고
		this.balance = balance;
	}
	//접근자 
	public int getDeposit(){		
		return balance;
	}
	public int getWithdraw(){		
		return balance;
	}
	public int getBalance(){		//현재의 잔고를 반환하는 메소드 
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
