							//�������̽��� ������ pdf ��2�� 
interface Movable 
//�������̽��� �ٵ� �ִ� �޼ҵ尡 ���� �ҹ�!!
{
	public  void speedUp( int amount );
	public void speedDown( int amount );
	
	public void printSpeed(){
		System.out.println("����ӵ�: " + speed);
	}
	/*�������̽��� �߻�޼ҵ��ε� �߻�޼ҵ�� �ٵ� ���� �� ����!
	MovableTest03.java:7: error: interface abstract methods cannot have body
        public void printSpeed(){
	MovableTest03.java:12: error: Car is not abstract and does not override abstract
		method printSpeed() in Movable
		class Car implements Movable

		==> �������̽����� �߻�޼ҵ��θ� �����Ǿ�� �ϴµ� 
				�ٵ� �ִ� �޼ҵ尡 �־� �����߻�
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
