							//�������̽��� ������ pdf ��2�� 
interface Movable 
//�������̽��� �ٵ� �ִ� �޼ҵ尡 ���� �ҹ�!!
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
		System.out.println("��ȸ�� �մϴ�.");
	} 
	public void turnLeft(){
		System.out.println("��ȸ�� �մϴ�.");
	}
	
	public  void speedUp( int amount ){
		System.out.println( amount + "��ŭ �ӵ��� �÷���.");
		speed += amount;
		System.out.println(speed + "�ӵ��� �޷���.");
	}
	public void speedDown( int amount ){
		System.out.println( amount + "��ŭ �ӵ��� ������.");
		speed -= amount;
		System.out.println( speed + "�ӵ��� �޷���.");
	}
	public String toString(){
		return fuel+","+company+","+color+","+name;
	}
	
	
}

class MovableTest04

{
	public static void main(String[] args) 
	{
		Car c = new Car("���̺긮��","����","����","�׷���");
		System.out.println(c);
		c.speedUp(20);
		c.speedDown(50);
		c.turnLeft();
		c.turnRight();
				
		
	}
}