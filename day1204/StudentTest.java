import java.util.Scanner;
class StudentTest
{
	public static void main(String []ars)
	{
		Scanner sc = new Scanner(System.in);
		
		int com,c,eng,math;
		double avg;

	System.out.print("��ǻ�Ͱ��� ������ �Է��ϼ���");
	com = sc.nextInt();
	System.out.print("C��� ���α׷��� ������ �Է��ϼ���");
	c = sc.nextInt();
	System.out.print("���� ������ �Է��ϼ���.");
	eng = sc.nextInt();
	System.out.print("�Ϲ� ���� ������ �Է��ϼ���.");
	math = sc.nextInt();

	avg = (com+c+eng+math)/4.0;

	System.out.println("��� ������" +avg+ "�� �Դϴ�. ");
	}
}