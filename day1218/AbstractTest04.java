abstract class Shape
{
	abstract  public void calcArea();
	public void test(){
		System.out.println("test ¿‘¥œ¥Ÿ.");
	}

}

class Circle extends Shape
{
	
	
}


class AbstractTest04
{
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.calcArea();
	}
}
