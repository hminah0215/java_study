class MethodTest01 
{
	//메소드의 정의 
	//메소드를 만들때 ==>  public static void 메소드이름 (){ 그 메소드가 해야할일을 순서대로  }  
	public static void sayHello(){
				
				for(int i = 1 ; i<= 3; i++){   //영수야, 안녕!을 3번출력하는 메소드. for로 쓰면 좋음.
				System.out.println("영수야, 안녕!");	
				}
	}
	

	public static void main(String[] args) 
	{

		sayHello();  //메소드를 호출
		
		System.out.println("오늘은 목요일입니다.");
		
		sayHello(); 
		
		int year = 2019;
		System.out.println(year);
		
		sayHello(); 

		/*  이렇게 하지말고 위와같이 메소드를 이용!
		System.out.println("영수야, 안녕!");
		System.out.println("영수야, 안녕!");
		System.out.println("영수야, 안녕!");

		System.out.println("오늘은 목요일입니다.");

		System.out.println("영수야, 안녕!");
		System.out.println("영수야, 안녕!");
		System.out.println("영수야, 안녕!");

		int year = 2019;
		System.out.println(year);

		System.out.println("영수야, 안녕!");
		System.out.println("영수야, 안녕!");
		System.out.println("영수야, 안녕!");
		*/
	}
}
