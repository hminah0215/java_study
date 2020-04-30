							//인터페이스아 다형성 pdf 랩2번 
interface Movable 
//인터페이스는 바디가 있는 메소드가 오면 불법!!
{
	public  void speedUp( int amount );
	public void speedDown( int amount );

	int speed = 100; //final이 생략되어있음.
}
class Car implements Movable
{
	public  void speedUp( int amount ){
		
	}
	public void speedDown( int amount ){
		
	}
}

class MovableTest02

{
	public static void main(String[] args) 
	{
		System.out.println("ok");
		
		Car c = new Car();
		c.speed = 200; //==> 스피드값 못바꿈 오류남. 
		System.out.println(c.speed);
		/*
		MovableTest02.java:27: error: cannot assign a value to final variable speed
                c.speed = 200;
		==>인터페이스 속의 변수명 앞에 final을 붙이지 않아도 기본이 
		final 입니다. 따라서 값을 변경할 수 없어요!! 
		*/
	}
}
