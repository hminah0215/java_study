//pdf ��ü��Ŭ����, ���α׷��� 1������ 

class Rectangle
{
	private int width;
	private int length;
//������ set
	public static void setWidth(	int width	){
		this.width = width;
	}
	public static void setLength(	int length	){
		this.length = length;
	}
//������ get
	public static int getWidth(){
		return width;
	}
	public static int getLength(){
		return length;
	}
//calcArea �޼ҵ� ��ȯ
	public static int clacArea( ){
		return width * length ;
	}
}  //������� Ŭ������ ����(���ο� �����͸� ����)



class  RectangleTest
{
	public static void main(String[] args) 
	{
		int k;						//�⺻�ڷ��� ���� 
									// �����ڽ��� "��"�� ������!
		k = 28;

		Rectangle r ;			// �����ڷ��� ���� ( Ŭ������ ����)
									//�����ڽ��� "��"�� ������ �ʾƿ�!
									// "��"�� �ִ� �޸𸮻��� �ּҸ� ������.(�����ѿ�)
								
									//Ŭ������ ������ ��ü�� �����ϰ� 
									//�� ��ü�� ���ؼ� ����� �� �־��.
		
		r = new Rectagle();   //��ü�� �����Ѵ�.
										//Rectangle�� �ڷ����� ������ �� �ִ� ����
										//r�� Rectagle�� ��ü�� �����ϰ� 
										//������ �� ��ü�� �޸𸮻��� �ּҸ� �����ؿ�.
			
	}
}
