//pdf 객체와클래스, 프로그래밍 1번문제 

class Rectangle
{
	private int width;
	private int length;

//생성자, 클래스와 이름이 같음, 생성자를 만들어서 원하는 값으로 초기값을 줄 수 있음. 
public Rectangle(){
	width = 10;
	length = 20;
}

//생성자의 중복, 매개변수의 개수나 자료형이 달라야 중복해서 쓸 수 있음.
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
} 이건 매개변수의 개수가 1개로 같고, 자료형도 같아서 허용 안됨.*/


//설정자 set
	public void setWidth(	int width	){
		this.width = width;
	}
	public void setLength(	int length	){
		this.length = length;
	}

//접근자 get
	public  int getWidth(){
		return width;
	}
	public  int getLength(){
		return length;
	}

//calcArea 메소드 반환
	public  int calcArea(){
		return width * length ;
	}
}  //여기까지 클래스의 정의(새로운 데이터를 만듦)



class  RectangleTest02
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();	 //생성자가 있으면 객체생성시 자동수행 됨. 
		
		//r.width - 20;//프라이빗접근불가. setter를 통해서 접근해야함. 
		//r.setWidth(10);
		//r.setLength(20);
		System.out.println("사각형의 면적 : " + r.calcArea());
		
		r.setWidth(40);  //생성자에서 주어진 처음값 말고 다른걸로 하고싶다면 아래에 넣으면됨
		
		System.out.println("r1사각형의 면적 : " + r.calcArea());
		
		Rectangle r2 = new Rectangle( 5,7 ); //중복된 생성자를 만들어야 출력됨.
		System.out.println("r2사각형의 면적 : " + r2.calcArea());

		Rectangle r3 = new Rectangle( 10 );
		Rectangle r4 = new Rectangle( 10.8 );
		System.out.println("r3사각형의 면적 : " + r3.calcArea());
		System.out.println("r4사각형의 면적 : " + r4.calcArea());

	}
}
