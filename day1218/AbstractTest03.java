abstract class Shape
{
	abstract  public void calcArea();
	public void test(){
		System.out.println("test �Դϴ�.");
	}

}

class Circle extends Shape
{
	public void calcArea(){
		System.out.println("���� ������ ����մϴ�.");
	}
}


class AbstractTest03
{
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.calcArea();
	}
}