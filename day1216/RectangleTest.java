//pdf 객체와클래스, 프로그래밍 1번문제 

class Rectangle
{
	private int width;
	private int length;
//설정자 set
	public static void setWidth(	int width	){
		this.width = width;
	}
	public static void setLength(	int length	){
		this.length = length;
	}
//접근자 get
	public static int getWidth(){
		return width;
	}
	public static int getLength(){
		return length;
	}
//calcArea 메소드 반환
	public static int clacArea( ){
		return width * length ;
	}
}  //여기까지 클래스의 정의(새로운 데이터를 만듦)



class  RectangleTest
{
	public static void main(String[] args) 
	{
		int k;						//기본자료형 변수 
									// 변수자신이 "값"을 가져요!
		k = 28;

		Rectangle r ;			// 참조자료형 변수 ( 클래스형 변수)
									//변수자신이 "값"을 가지지 않아요!
									// "값"이 있는 메모리상의 주소를 가져요.(가르켜요)
								
									//클래스형 변수는 객체를 생성하고 
									//그 객체를 통해서 사용할 수 있어요.
		
		r = new Rectagle();   //객체를 생성한다.
										//Rectangle의 자료형을 참조할 수 있는 변수
										//r이 Rectagle의 객체를 생성하고 
										//생성된 그 객체의 메모리상의 주소를 참조해요.
			
	}
}
