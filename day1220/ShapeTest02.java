abstract class Shape
{
	protected int x;
	protected int y;
	protected double area;
	
	abstract public void calcArea();
	

	public Shape( int x, int y){
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return "x: " + x +", y: "+y;
	}
}

class Rect extends Shape  
{
	private double width;
	private double height;
	
	public Rect(int x, int y,double width,double height){
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void drawRect(){
		System.out.println(this);
		System.out.println("사각형을 그립니다.");
	}

	public void calcArea(){
		area = width * height;
	}
	public String toString(){
		return super.toString() +", 가로:" +width+", 세로:"+height+", 면적:"+area;
	}

}

class Circle extends Shape 
{
	private double radius;
	public static final double PI = 3.141592; 
	//상수는 변수명을 대문자로쓰는게 일반적. final은 static과 함께 쓰는게 좋음. 꼭은 아님
	
	public Circle(int x, int y, double radius){
		super( x,y );
		this.radius = radius;
	}
	public void drawCircle(){
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

class  ShapeTest02
 {
	public static void main(String[] args) 
	{
		Shape []arr = new Shape[2]; 
		arr[0] = new Rect(10,10,100,200);
		arr[1] = new Circle(	 10,220,50	);
		
		for( int i=0; i < arr.length; i++){

			arr[i].calcArea();
			if(	 arr[i]  instanceof  Rect	){
				((Rect)arr[i]).drawRect();
			}else if( arr[i] instanceof Circle){
				((Circle)arr[i]).drawCircle();
			}
		}
	}
}
