class MethodTest02
{
	//메소드의 정의 
	//메소드를 만들때 ==>  public static void 메소드이름 (){ 그 메소드가 해야할일을 순서대로  }  
	//메소드이름 ( ) ==> ( )이 안에 아래 전달한 인수의 자료형을 입력한다. 
	public static void sayHello( String irum ){
				
				for(int i = 1 ; i<= 3; i++){   
				System.out.println(irum+  "야(아), 안녕!");	
				}
	}
	

	public static void main(String[] args) 
	{

	//메소드를 호출시 메소드 실행에 필요한 인수를 전달!
		sayHello("원우");  
		
		System.out.println("오늘은 목요일입니다.");
		
		sayHello("수인"); 
		
		int year = 2019;
		System.out.println(year);
		
		sayHello("영수"); 


	}
}
