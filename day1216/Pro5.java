//12월 16일 월요일 숙제 프로그래밍5번 
class BankAccount
{
	private String name;     //이름
	private String acc;			//계좌번호
	private int money;			//잔액
	private double eja;		//이자율

	//생성자
		//모든데이터를 받는 생성자
	public BankAccount(String name, String acc, int money,  double eja ){
		
		this.name = name;
		this.acc = acc;
		this.money = money;
		this.eja = eja;
	}
		//데이터를 하나도 받지않는 생성자
	public BankAccount(){
		
	}
	
	//설정자
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

	//접근자
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

	//출력
	public void info(){
		System.out.println("예금주 이름: " + name );
		System.out.println("계좌번호: " + acc );
		System.out.println("계좌 잔액: " + money );
		System.out.println("이자율: " + eja );	
}


class Pro5 
{
	public static void main(String[] args) 
	{
		BankAccount ba = new BankAccount("현민아","123-456-78900",500, 3.2);
		ba.info();
	}
}
