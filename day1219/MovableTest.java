							//인터페이스아 다형성 pdf 랩2번 
interface Movable 
//인터페이스는 바디가 있는 메소드가 오면 불법!!
{
	public  void speedUp( int amount );
	public void speedDown( int amount );

	int speed = 100; //값이 정해져있어서 가능
	/*
	int speed;  
	==> 인터페이스는 추상메소드와 상수(정해진값)만 으로 구성되어요.
	그래서 값이 정해지지않은 변수는 올수없음. 반드시 변수에 초기값이 있어야함.
	*/
	

}

class MovableTest

{
	public static void main(String[] args) 
	{
		System.out.println("ok");
	}
}
