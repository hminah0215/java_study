//������ 

class Box{

	private double width;
	private double length;
	private double height;
	private double volume;
	
	//�Ű������� �̸��� �ǹ��ִ� �̸�����  �ָ� ����� �̸��� ��ĥ�� �Ű�������
	//������ �� ���Ƽ� ����� �ʱ�ȭ�� ��������. �̷��� this.  �� ���!!
	public Box( double width, double length, double height){  
	//�������� �ߺ�! �Ű������� ������ �ٸ��ų� �ڷ����� �޶�� �ߺ��ؾ� ��밡��. 
		this.width = width;
		this.length = length;
		this.height = height;
	// ������̸� = �Ű����� 
	}

	//�����ڴ� Ŭ���� �̸��� ���� Ư���� �޼ҵ�, �翬�� ��ҹ��ڸ� ������ ������. 
	//�����ڴ� ȣ����� �ʰ� ��ü ������ �ڵ� �����. �׷��� return�̶�� ������ ����. 
	//�����ڴ� ����Ÿ���� ���� ����. 
	public Box(){
		width = 10;
		length = 5;
		height = 4;
		System.out.println("������ �����մϴ�.");
	}

	public void calcVolume(){
		volume = width * length * height;
	}


	public void setWidth( double width ){
		this.width = width;
	}

	public double getWidth(){
		return width;
	}
	public void setLength( double length ){
		this.length = length;
	}
		public double getLength(){
		return length;
	}
	public void setHeight( double height ){
		this.height = height;
	}
		public double getHeight(){
		return height;
	}
	
	public double getVolume(){
		return volume;
	}

	

}


class  BoxTest03
{
	public static void main(String[] args) 
	{
		Box b1 = new Box(); //��ü�� ���� �����Ҷ� �����ڰ� �ڵ� ���� ��. 
		Box b2 = new Box(20,30,5);
		b1.calcVolume();
		
		System.out.println("ù��° �ڽ��� ���� ");
		System.out.println("����:" + b1.getWidth());
		System.out.println("����:" + b1.getLength());
		System.out.println("����:" + b1.getHeight());
		System.out.println("����:" + b1.getVolume());
		
		b2.calcVolume();
		System.out.println();		
		System.out.println("�ι�° �ڽ��� ���� ");
		System.out.println("����:" + b2.getWidth());
		System.out.println("����:" + b2.getLength());
		System.out.println("����:" + b2.getHeight());
		System.out.println("����:" + b2.getVolume());
		
	
		
	
	}
}