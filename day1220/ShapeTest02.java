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
		System.out.println("�簢���� �׸��ϴ�.");
	}

	public void calcArea(){
		area = width * height;
	}
	public String toString(){
		return super.toString() +", ����:" +width+", ����:"+height+", ����:"+area;
	}

}

class Circle extends Shape 
{
	private double radius;
	public static final double PI = 3.141592; 
	//����� �������� �빮�ڷξ��°� �Ϲ���. final�� static�� �Բ� ���°� ����. ���� �ƴ�
	
	public Circle(int x, int y, double radius){
		super( x,y );
		this.radius = radius;
	}
	public void drawCircle(){
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