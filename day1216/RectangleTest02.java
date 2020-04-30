//pdf ��ü��Ŭ����, ���α׷��� 1������ 

class Rectangle
{
	private int width;
	private int length;

//������, Ŭ������ �̸��� ����, �����ڸ� ���� ���ϴ� ������ �ʱⰪ�� �� �� ����. 
public Rectangle(){
	width = 10;
	length = 20;
}

//�������� �ߺ�, �Ű������� ������ �ڷ����� �޶�� �ߺ��ؼ� �� �� ����.
public Rectangle( int width, int length){
	this.width = width;
	this.length = length;
}
public Rectangle( int width ){
	this.width = width;
	length = 2;
}
public Rectangle( double width ){
	this.width = (int)width;
	length = 2;
}
/*public Rectangle( int length ){
	this.length = length;
	width = 2;
} �̰� �Ű������� ������ 1���� ����, �ڷ����� ���Ƽ� ��� �ȵ�.*/


//������ set
	public void setWidth(	int width	){
		this.width = width;
	}
	public void setLength(	int length	){
		this.length = length;
	}

//������ get
	public  int getWidth(){
		return width;
	}
	public  int getLength(){
		return length;
	}

//calcArea �޼ҵ� ��ȯ
	public  int calcArea(){
		return width * length ;
	}
}  //������� Ŭ������ ����(���ο� �����͸� ����)



class  RectangleTest02
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();	 //�����ڰ� ������ ��ü������ �ڵ����� ��. 
		
		//r.width - 20;//�����̺����ٺҰ�. setter�� ���ؼ� �����ؾ���. 
		//r.setWidth(10);
		//r.setLength(20);
		System.out.println("�簢���� ���� : " + r.calcArea());
		
		r.setWidth(40);  //�����ڿ��� �־��� ó���� ���� �ٸ��ɷ� �ϰ��ʹٸ� �Ʒ��� �������
		
		System.out.println("r1�簢���� ���� : " + r.calcArea());
		
		Rectangle r2 = new Rectangle( 5,7 ); //�ߺ��� �����ڸ� ������ ��µ�.
		System.out.println("r2�簢���� ���� : " + r2.calcArea());

		Rectangle r3 = new Rectangle( 10 );
		Rectangle r4 = new Rectangle( 10.8 );
		System.out.println("r3�簢���� ���� : " + r3.calcArea());
		System.out.println("r4�簢���� ���� : " + r4.calcArea());

	}
}