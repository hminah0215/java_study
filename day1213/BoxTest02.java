//생성자 

class Box{

	private double width;
	private double length;
	private double height;
	private double volume;
	
	public Box( double w, double l, double h){  
	//생성자의 중복! 매개변수의 개수가 다르거나 자료형이 달라야 중복해야 사용가능. 
		width = w;
		length = l;
		height = h;
	}

	//생성자는 클래스 이름과 같은 특별한 메소드, 당연히 대소문자를 엄격히 구분함. 
	//생성자는 호출받지 않고 객체 생성시 자동 수행됨. 그래서 return이라는 개념이 없음. 
	//생성자는 리턴타입을 적지 않음. 
	public Box(){
		width = 10;
		length = 5;
		height = 4;
		System.out.println("생성자 동작합니다.");
	}

	public void calcVolume(){
		volume = width * length * height;
	}


	public void setWidth( double w ){
		width = w;
	}

	public double getWidth(){
		return width;
	}
	public void setLength( double l ){
		length = l;
	}
		public double getLength(){
		return length;
	}
	public void setHeight( double h ){
		height = h;
	}
		public double getHeight(){
		return height;
	}
	
	public double getVolume(){
		return volume;
	}

	

}


class  BoxTest02
{
	public static void main(String[] args) 
	{
		Box b1 = new Box(); //객체를 새로 생성할때 생성자가 자동 수행 됨. 
		Box b2 = new Box(20,30,5);
		b1.calcVolume();
		
		System.out.println("첫번째 박스의 정보 ");
		System.out.println("가로:" + b1.getWidth());
		System.out.println("세로:" + b1.getLength());
		System.out.println("높이:" + b1.getHeight());
		System.out.println("부피:" + b1.getVolume());
		
		b2.calcVolume();
		System.out.println();		
		System.out.println("두번째 박스의 정보 ");
		System.out.println("가로:" + b2.getWidth());
		System.out.println("세로:" + b2.getLength());
		System.out.println("높이:" + b2.getHeight());
		System.out.println("부피:" + b2.getVolume());
		
	
		
	
	}
}
