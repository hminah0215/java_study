							//�������̽��� ������ pdf ��2�� 
interface Movable 
//�������̽��� �ٵ� �ִ� �޼ҵ尡 ���� �ҹ�!!
{
	public  void speedUp( int amount );
	public void speedDown( int amount );

	int speed = 100; //final�� �����Ǿ�����.
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
		c.speed = 200; //==> ���ǵ尪 ���ٲ� ������. 
		System.out.println(c.speed);
		/*
		MovableTest02.java:27: error: cannot assign a value to final variable speed
                c.speed = 200;
		==>�������̽� ���� ������ �տ� final�� ������ �ʾƵ� �⺻�� 
		final �Դϴ�. ���� ���� ������ �� �����!! 
		*/
	}
}