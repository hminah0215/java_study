import java.util.*;

class InputTest1 
{
	public static void main(String[] args) 
	{
		int radius; //������
		double vol; //���� ����
		//���������� �������ϱ� ���� ����=����*�������� ����

		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �������� �Է��ϼ���. ");
		radius = in.nextInt();
		
		vol = 3.14 * (radius * radius);
		System.out.println("���� ������ " +vol + " �Դϴ�");
		
	
		

	}
}
