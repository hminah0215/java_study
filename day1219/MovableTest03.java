							//인터페이스아 다형성 pdf 랩2번 
interface Movable 
//인터페이스는 바디가 있는 메소드가 오면 불법!!
{
	public  void speedUp( int amount );
	public void speedDown( int amount );
	
	public void printSpeed(){
		System.out.println("현재속도: " + speed);
	}
	/*인터페이스는 추상메소드인데 추상메소드는 바디를 가질 수 없어!
	MovableTest03.java:7: error: interface abstract methods cannot have body
        public void printSpeed(){
	MovableTest03.java:12: error: Car is not abstract and does not override abstract
		method printSpeed() in Movable
		class Car implements Movable

		==> 인터페이스에는 추상메소드들로만 구성되어야 하는데 
				바디가 있는 메소드가 있어 오류발생
	*/
	
	int speed = 100; 
}
class Car implements Movable
{
	public  void speedUp( int amount ){
		
	}
	public void speedDown( int amount ){
		
	}
}

class MovableTest03

{
	public static void main(String[] args) 
	{
		Car c = new Car();
		System.out.println("ok");
		
		
	}
}
