class BankAccount
{
	private double balance;
	
	public void printBalance(){
		System.out.println( "현재잔액: " + balance);
	}

	public void deposit( int amount ){
		balance = balance + amount;
	}

	public void withdraw( int amount ){
		if(amount <= balance){
			balance -= amount;
		}else{
			System.out.println("잔액이 부족합니다.");
		}
		
		/*if( amount > balance  ){
			System.out.println("잔액이 부족합니다.");
			return;
		}
		balance -= amount; 
		이렇게 해도 됨.*/
	}
	//설정자
	public void setBalance( int balance ){
		this.balance = balance;
	}
	//접근자 
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

		a1.setBalance(100); //a1.setDeposit(100); 이번건 이렇게 해도 됨.
		a2.setBalance(50);
		
		a1.withdraw(60);
		a2.withdraw(30);

		System.out.println( "현재잔액: "+a1.getBalance() );   //40 출력
		System.out.println( "현재잔액: "+a2.getBalance() );	//20출력

		a1.printBalance(); //40출력
		a2.printBalance(); //20출력
		
		a1.addInterest();
		a2.addInterest();
		
		a1.printBalance(); //43 출력
		a2.printBalance(); //21.5출력 

		a1.withdraw(30);  //인출이 일어남. 
		a1.withdraw(20);	 //음수가 되서 인출이 일어나지 않음. 
		a1.printBalance();  //13 출력
	}
}
