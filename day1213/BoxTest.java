import java.util.Scanner;
class Box{

	private double width;
	private double length;
	private double height;
	private double volume;
	
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


class  BoxTest
{
	public static void main(String[] args) 
	{
		Box b1 = new Box();
		b1.setWidth(10);
		b1.setLength(5);
		b1.setHeight(2);
		b1.calcVolume();
		
		System.out.println("ù��° �ڽ��� ���� ");
		System.out.println("����:" + b1.getWidth());
		System.out.println("����:" + b1.getLength());
		System.out.println("����:" + b1.getHeight());
		System.out.println("����:" + b1.getVolume());
		
		Box b2 =new Box();
		b2.setWidth(20);
		b2.setLength(30);
		b2.setHeight(5);
		b2.calcVolume();
		
		System.out.println();
		System.out.println("�ι�° �ڽ��� ���� ");
		System.out.println("����:" + b2.getWidth());
		System.out.println("����:" + b2.getLength());
		System.out.println("����:" + b2.getHeight());
		System.out.println("����:" + b2.getVolume());
		
	
	}
}