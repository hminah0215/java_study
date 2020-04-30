abstract class Shape
{
	abstract  public void calcArea();
	public void test(){
		System.out.println("test 입니다.");
	}

}

class Circle extends Shape
{
	public void calcArea(){
		System.out.println("원의 면적을 계산합니다.");
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
