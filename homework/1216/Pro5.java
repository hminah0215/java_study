//12월 16일 월요일 숙제 프로그래밍5번 
class BankAccount
{
	private String name;     //이름
	private String acc;			//계좌번호
	private double money;			//잔액
	private double eja;		//이자율

	//생성자 : 멤버변수들의 값을 초기화할 목적으로 사용하는 특수한 메소드. 
		//모든데이터를 받는 생성자
	public BankAccount( String name, String acc, double money,  double eja ){
		
		this.name = name;
		this.acc = acc;
		this.money = money;
		this.eja = eja;
	}
		//데이터를 하나도 받지않는 생성자
	public BankAccount(){
		
	}
	
	//설정자 : 접근해서 값을 변경하는것.
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

	//접근자 : 접근해서 값을 읽어옴.
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

	//출력
	public void info(){
		System.out.println("예금주 이름: " + name );
		System.out.println("계좌번호: " + acc );
		System.out.println("계좌 잔액: " + money );
		System.out.println("이자율: " + eja+"%\n" );	
	}
}


class Pro5 
{
	public static void main(String[] args) 
	{
		BankAccount ba = new BankAccount("현민아","123-456-78900",500, 3.2);
		System.out.println("첫번째 계좌의 정보");
		System.out.println("이름:" + ba.getName());
		System.out.println("계좌번호:" + ba.getAcc());
		System.out.println("잔액:" + ba.getMoney());
		System.out.println("이자율:" + ba.getEja());
	
		System.out.println("============================");
		
		BankAccount ba2 = new BankAccount();
		System.out.println("두번째 계좌의 정보");
		System.out.println("이름:" + ba2.getName());
		System.out.println("계좌번호:" + ba2.getAcc());
		System.out.println("잔액:" + ba2.getMoney());
		System.out.println("이자율:" + ba2.getEja());
		
		System.out.println("============================");
	
		BankAccount ba3 = new BankAccount();
		ba3.info();


	}
}
