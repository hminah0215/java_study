class MethodTest03
{
	//메소드를 만들때 ==>  public static void 메소드이름 (){ 그 메소드가 해야할일을 순서대로  }  
	
	//메소드이름 ( 매개변수 ) ==> ( )이 안에 아래 전달한 인수의 자료형을 입력한다. 
	//										 ==> 인수의 자료형, 작동시키고 싶은 횟수의 자료형도 입력 
	
	public static void sayHello( String irum, int n ){
				
				//출력횟수를 바꾸고 싶으니 매개변수에 입력한 변수이름까지로!
				for(int i = 1 ; i <= n; i++){   
				System.out.println(irum+  "야(아), 안녕!");	
				}
	} //여기까지가 메소드의 정의
	

	public static void main(String[] args) 
	{

	//메소드를 호출시 메소드 실행에 필요한 인수를 전달!
	//
		sayHello("원우",2);   // 2번 인사하고 싶다. 
		
		System.out.println("오늘은 목요일입니다.");
		
		sayHello("수인",10); 
		
		int year = 2019;
		System.out.println(year);
		
		sayHello("영수",5); 


	}
}
