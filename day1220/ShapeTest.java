//상속과 다형성 pdf 프로그래밍1번 (사각형이랑 원만)
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
		return super.toString() +", 가로:" +width+", 세로:"+height+", 면적:"+area;
	}
	
	public void draw(){
		Random r  = new Random();
		x = r.nextInt( CANVAS_WIDTH - (int)width ) ;
		y = r.nextInt( CANVAS_HEIGHT - (int)height);

		System.out.println(this);
		System.out.println("사각형을 그립니다.");
	}
	public void calcArea(){
		area = width * height;
	}
}

class Circle extends Shape implements Drawable
{
	private double radius;
	public static final double PI = 3.141592; 
	//상수는 변수명을 대문자로쓰는게 일반적. final은 static과 함께 쓰는게 좋음. 꼭은 아님
	
	public Circle(int x, int y, double radius){
		super( x,y );
		this.radius = radius;
	}
	public void draw(){
		Random r  = new Random();
		x = r.nextInt( CANVAS_WIDTH - (int)radius*2 ) ;
		y = r.nextInt( CANVAS_HEIGHT - (int)radius*2 );
		System.out.println(toString()); //this 나 자신을 호출해도 됨. 
		System.out.println("원을 그립니다.");
	}
	public void calcArea(){
		area = radius * radius * Circle.PI;
		//area = radius * radius * PI;   그냥 파이로불러도 되고 클래스명.파이 해도됨.
	}
	public String toString(){
		return super.toString() +", 반지름: "+ radius+", 면적:"+area;
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
			//calacArea는 shape에 있었으므로 shape으로 캐스팅	
		}
		for(int i = 1; i <= 3 ; i++){
			System.out.println("모든 도형을 그려 봅니다. " + i +"번째");
			for(int j = 0 ; j < arr.length ; j++){
				arr[j].draw();
				System.out.println();
			}
			System.out.println("=========================");
		}
	}
}
