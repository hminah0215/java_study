import java.util.Scanner;

class Circle{
	public static void main(String []args){

	int r;
	int h;
	double b;
	double pai=3.141592;

	Scanner sc = new Scanner(System.in);

	System.out.println("����� �ظ��� �������� �Է��Ͻÿ�.");
	r = sc.nextInt();
	System.out.println("������� ���̸� �Է��Ͻÿ�.");
	h = sc.nextInt();

	b = (pai*r*r)*h;

	System.out.println("���Ǵ�" +b + "�Դϴ�");
	
	}
}



