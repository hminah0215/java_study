class Family
{
	//접근명시자 생략하고 static설명
	public String name;
	public int age;
	//위 두개는 일반멤버
	public static String addr; //static변수는 공용공간이니까 private을 사용하지 않고 public! 
	//클래스변수 : 객체마다공동으로 사용하는 기억공간or객체없이도 사용할 기억공간
	
	//생성자
	public Family(String name, int age ){
		this.name = name;
		this.age = age;
	}
	
	//일반메소드 : 객체를 생성하고, 객체안에서만 작동
	public void info(){
		System.out.println(name+","+age+","+addr);
	}

	//클래스메소드 : 객체없이도 동작을 사용가능 
	public static void move(){
		addr = "서울시 마포구 신수동";
		System.out.println("우리집이 이사갑니다.\n" + addr);
		//name = "홍길동"; ==>Stactic메소드 안에서는 static멤버에만 접근할 수 있다.
		//age =50;					그래서 이 두개는 안됨.
	}
}


class  StaticTest02
{
	public static void main(String[] args) 
	{
		/*
		Family.addr = "서울시 서대문구 홍제동"; //클래스변수 접근.공동으로 사용하는 메모리
		
		Family f1 = new Family("이수인",20);
		Family f2 = new Family("이원우",23);
		
		f1.info();
		f2.info();   */

		Family.move();
		
		
		
	}
}
