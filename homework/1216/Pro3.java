class Box
{
	private int height;
	private int width;
	private int length;
	private String empty; //�̰��ϴ� �⼮�ҷ��� �� 

	//������

	public Box(int height, int width, int length){
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public Box(){
		
	}
	
	//������
	public void setHeight( int height){
		this.height = height;
	}
	public void setWidth( int width){
		this.width = width;
	}
	public void setLength( int length){
		this.length = length;
	}

	//������
	public int getHeight(){
		return height;
	}
		public int getWidth(){
		return width;
	}
		public int getLength(){
		return length;
	}
	//���
	public void print(){
		System.out.println("�ڽ��� ����: " + height);
		System.out.println("�ڽ��� ���α���: " + width);
		System.out.println("�ڽ��� ���α���: " + length+"\n");		
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
