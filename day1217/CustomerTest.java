//상속 pdf 프로그래밍2번
class Person
{
	protected String name;  //상속을 염두에 둘때 외부의 다른 클래스들에게는 접근을 
	protected String addr;   //못하게 하지만 자식 클래스에게는 접근할 수 있도록 
	protected String tel;		//프로텍티드로! 

	//생성자
	public Person( String name, String addr,String tel){
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}
	public Person(){
		
	}

	//설정자
	public void setName(String name){
		this.name = name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public void setTel(String tel){
		this.tel = tel;
	}

	//접근자
	public String getName(){
		return name;
	}
	public String getAddr(){
		return addr;
	}
	public String getTel(){
		return tel;
	}
	//투스트링
	public String toString(){
		return name+","+addr+","+tel;
	}
}
class Customer extends Person   //person을 상속. 커스토머는 펄슨이다.
{
	private int no;
	private int point;
	
	//생성자: 부모의 프라이빗은 받을 수 없음. 부모의 속성이 프로텍티드여야 접근가능.
	public Customer( String name, String addr, String tel, int no, int point){
		/*this.name = name;
		this.addr = addr;
		this.tel = tel;  이렇게 해도 됨*/ 
		super(name,addr,tel); //부모의 생성자에게 초기화값을 전달해 주고 싶을때 수퍼!
		this.no = no;
		this.point = point;
	}
	public Customer(){
		//super();  생략해도 됨.
	}


	//설정자
	public void setNo( int no){
		this.no = no;
	}
	public void setPoint( int point){
		this.point = point;
	}
	//접근자
	public int getNo(){
		return no;
	}
	public int getPoint(){
		return point;
	}
	//투스트링
	public String toString(){
		return super.toString()+","+no+","+point;
		//부모에있는 투 스트링을 불러옴.
	}
	
}

class  CustomerTest
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("홍길동","서울","010-111-1111");
		Customer c1 = new Customer("이수인","서울","010-777-7777", 1000, 10000);
		System.out.println(p1);
		System.out.println(c1);
	}
}
