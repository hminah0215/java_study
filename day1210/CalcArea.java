//Abbb���ϰ� ����. �������� ����ġ�� ����ؼ� Ǯ���ֽŰ�. 
import java.util.Scanner;
class CalcArea 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String type;
		double area=0,width,height,radius; 
		System.out.println("*** ���� ���� ��� ���α׷�***");
		System.out.print("������ ������ �Է��ϼ���(R:�簢��, T:�ﰢ��, C:��) ===>");
		type= sc.next();
		
	
		switch(type) //���ڿ��� ���������� ��밡��. 
		{
			case "R": case "r":
			System.out.print("�簢�� �غ��� ���̸� �Է��ϼ��� ===>");
			width= sc.nextDouble();
			System.out.print("�簢���� ���̸� �Է��ϼ��� ===>");
			height= sc.nextDouble();
			area =  width * height;
			break;

			case "T": case "t":
			System.out.print("�ﰢ�� �غ��� ���̸� �Է��ϼ��� ===>");
			width= sc.nextDouble();
			System.out.print("�ﰢ���� ���̸� �Է��ϼ��� ===>");
			height= sc.nextDouble();
			area =  width * height / 2;
			break;

			case "C": case "c":
			System.out.print("���� �������� �Է��ϼ��� ===>");
			radius= sc.nextDouble();
			area =  3.141592 * radius * radius;
			break;
		}
			System.out.println("������ ������ "+ area+ " �Դϴ�.");
	}
}
