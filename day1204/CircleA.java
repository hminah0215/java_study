import java.util.Scanner;
class CircleA 
 {
	public static void main(String[] args) 
	{
		int radius,height;
		double volume;

	Scanner sc = new Scanner(System.in);

	System.out.println("����� �ظ��� �������� �Է��Ͻÿ�.");
	radius = sc.nextInt();
	System.out.println("������� ���̸� �Է��Ͻÿ�.");
	height = sc.nextInt();
	
	volume= 3.141592 * radius * radius * height;
		
		System.out.println("���Ǵ�" +volume + "�Դϴ�");

	}
}
