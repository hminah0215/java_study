							//인터페이스아 다형성 pdf 랩2번 
interface Movable 
//인터페이스는 바디가 있는 메소드가 오면 불법!!
{
	public  void speedUp( int amount );
	public void speedDown( int amount );
	int speed = 100; 

}
class Car implements Movable
{
	private String fuel;
	private double distance;
	private String company;
	private String color;
	private String name;
	int speed =100;

	public Car( String fuel, String company, String color, String name){
		this.fuel = fuel;
		this.company = company;
		this.color = color;
		this.name = name;
	}

	public void turnRight(){
		System.out.println("우회전 합니다.");
	} 
	public void turnLeft(){
		System.out.println("좌회전 합니다.");
	}
	
	public  void speedUp( int amount ){
		System.out.println( amount + "만큼 속도를 올려요.");
		speed += amount;
		System.out.println(speed + "속도로 달려요.");
	}
	public void speedDown( int amount ){
		System.out.println( amount + "만큼 속도를 내려요.");
		speed -= amount;
		System.out.println( speed + "속도로 달려요.");
	}
	public String toString(){
		return fuel+","+company+","+color+","+name;
	}
	
	
}

class MovableTest04

{
	public static void main(String[] args) 
	{
		Car c = new Car("하이브리드","현대","빨강","그랜져");
		System.out.println(c);
		c.speedUp(20);
		c.speedDown(50);
		c.turnLeft();
		c.turnRight();
				
		
	}
}
