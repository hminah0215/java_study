//��Ӱ� ������ pdf ���α׷���1�� (�簢���̶� ����)
import	java.util.Random;
interface Drawable
{
	public void draw();
}

abstract class Shape
{
	protected int x;
	protected int y;
	protected double area;
	public final int CANVAS_WIDTH = 600;
	public final int CANVAS_HEIGHT = 400;

	abstract public void calcArea();
	

	public Shape( int x, int y){
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return "x: " + x +", y: "+y;
	}
}

class Rect extends Shape  implements Drawable
{
	private double width;
	private double height;
	
	public Rect(int x, int y,double width,double height){
		super(x,y);
		this.width = width;
		this.height = height;
	}

	public String toString(){
		return super.toString() +", ����:" +width+", ����:"+height+", ����:"+area;
	}
	
	public void draw(){
		Random r  = new Random();
		x = r.nextInt( CANVAS_WIDTH - (int)width ) ;
		y = r.nextInt( CANVAS_HEIGHT - (int)height);

		System.out.println(this);
		System.out.println("�簢���� �׸��ϴ�.");
	}
	public void calcArea(){
		area = width * height;
	}
}

class Circle extends Shape implements Drawable
{
	private double radius;
	public static final double PI = 3.141592; 
	//����� �������� �빮�ڷξ��°� �Ϲ���. final�� static�� �Բ� ���°� ����. ���� �ƴ�
	
	public Circle(int x, int y, double radius){
		super( x,y );
		this.radius = radius;
	}
	public void draw(){
		Random r  = new Random();
		x = r.nextInt( CANVAS_WIDTH - (int)radius*2 ) ;
		y = r.nextInt( CANVAS_HEIGHT - (int)radius*2 );
		System.out.println(toString()); //this �� �ڽ��� ȣ���ص� ��. 
		System.out.println("���� �׸��ϴ�.");
	}
	public void calcArea(){
		area = radius * radius * Circle.PI;
		//area = radius * radius * PI;   �׳� ���̷κҷ��� �ǰ� Ŭ������.���� �ص���.
	}
	public String toString(){
		return super.toString() +", ������: "+ radius+", ����:"+area;
	}
}

class  ShapeTest
 {
	public static void main(String[] args) 
	{
		//Shape []arr = new Shape[2]; 
		Drawable []arr = new Drawable[2];
		arr[0] = new Rect(10,10,100,200);
		arr[1] = new Circle(	 10,220,50	);
		
		for( int i=0; i < arr.length; i++){

			((Shape)arr[i]).calcArea();
			//calacArea�� shape�� �־����Ƿ� shape���� ĳ����	
		}
		for(int i = 1; i <= 3 ; i++){
			System.out.println("��� ������ �׷� ���ϴ�. " + i +"��°");
			for(int j = 0 ; j < arr.length ; j++){
				arr[j].draw();
				System.out.println();
			}
			System.out.println("=========================");
		}
	}
}
