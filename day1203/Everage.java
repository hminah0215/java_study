import java.util.Scanner;

class Everage{
	public static void main(String []args){

	int com;
	int clang;
	int eng;
	int math;
	int avg;

	Scanner sc = new Scanner(System.in);
	System.out.println("��ǻ�Ͱ��� ������ �Է��ϼ���");
	com = sc.nextInt();
	System.out.println("C��� ���α׷��� ������ �Է��ϼ���");
	clang = sc.nextInt();
	System.out.println("���� ������ �Է��ϼ���.");
	eng = sc.nextInt();
	System.out.println("�Ϲ� ���� ������ �Է��ϼ���.");
	math = sc.nextInt();
	
	avg =((com+clang+eng+math)/4);

	System.out.println("��� ������ "+avg+ "�Դϴ�.");
	
	

}
	}