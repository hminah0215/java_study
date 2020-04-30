/*		��� pdf ���α׷��� 6��     */

abstract class Shape
//Ŭ������ �߻�޼ҵ带 �ϳ��� ������ ������ �� Ŭ������ �߻�Ŭ������ �Ǿ���Ѵ�. 

{
	protected int x;
	protected int y;
	protected double area;

	abstract public void calcArea();
	//�߻�޼ҵ�. �ݵ�� ��ӹ޾Ƽ� �������ض�!��� �����ϴ� ��.
	//{�ٵ�}�� ���ְ� �տ� abstract�� ����

	public Shape(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "������ ��ġ("+x+","+y+")  ,������ ����: " + area;
	}
}

class Rect extends Shape
{
	private double width;
	private double height;

	public Rect( int x, int y, double width, double height ){
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void calcArea(){
		area = width * height;
	}
	public String toString(){
		return "�簢��: "+ super.toString() + ",����:" + width +",����:" + height; 
	}
}

class Circle extends Shape
{
	private double radius; 
	
	public Circle(int x, int y, double radius){
		super(x,y); //�θ� ���� �������� �ϱ⶧���� �� ù��°��! 
		this.radius = radius;
	}
	public void calcArea(){
		area = radius * radius * 3.1415;
	}
	public String toString(){
		return"��: "+ super.toString() + ",������:"+radius;
	}
}

class Triangle extends Shape
{
	private double width;
	private double heigth;

	public Triangle(int x, int y,double width,double heigth ){
		super(x,y);
		this.width =	width;
		this.heigth = heigth;
	}
	public void calcArea(){
		area = (width * heigth) /2;
	}
	public String toString(){
		return "�ﰢ��: " + super.toString() + ",����:"+width+ ",����:" +heigth;
	}
}



class  ShapeTest
{
	public static void main(String[] args) 
	{
		Rect r = new Rect( 10,10,100,200 );
		r.calcArea();
		System.out.println(r);

		Circle c = new Circle( 10, 220, 50 );
		c.calcArea();
		System.out.println(c);

		Triangle t = new Triangle( 10, 330,100, 200 );
		t.calcArea();
		System.out.println(t);
	}
}