class Box
{
	private int height;
	private int width;
	private int length;
	private String empty; //이거하다 출석불러서 감 

	//생성자

	public Box(int height, int width, int length){
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public Box(){
		
	}
	
	//설정자
	public void setHeight( int height){
		this.height = height;
	}
	public void setWidth( int width){
		this.width = width;
	}
	public void setLength( int length){
		this.length = length;
	}

	//접근자
	public int getHeight(){
		return height;
	}
		public int getWidth(){
		return width;
	}
		public int getLength(){
		return length;
	}
	//출력
	public void print(){
		System.out.println("박스의 높이: " + height);
		System.out.println("박스의 가로길이: " + width);
		System.out.println("박스의 세로길이: " + length+"\n");		
	}
}



class  Pro3
{
	public static void main(String[] args) 
	{
		Box b = new Box( 10,20,5 );
		b.print();

		Box b2 = new Box( );
		b2.print();

	}
}
