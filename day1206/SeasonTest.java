//��������� ���� �Է¹޾� ������ ���(���� ��������)
import java.util.Scanner;
class SeasonTest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int month;
		System.out.println("***������ Ȯ�� ���α׷�***");
		System.out.print("���� �Է��ϼ���.===>");
		month = sc.nextInt();

		String result = "�ܿ�";//����Ʈ�� �ܿ��� ��Ƴ��� ��,����,������ ������
		//���� �� �������� else �ܿ��� �Է����� �ʾƵ� �������� �ܿ���

		if( month <1 || month>12 ) //�߸��ȹ����� ��������غ��� ��.
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return; //������ Ȯ�� ���α׷��� �ٽ� ����ϴ� �ɷ� ���ư���.
			//1~12�� �Էµǵ��� ������ �� ��.
		}
		
		if( month >=3 && month <=5 )
			result = "��";
		
		/*����ڰ� �Է��� month�� 4�̸� ������ ���̰����� �Ǿ����Ƿ� ���� 
		�Ʒ����� �� ����� �ʵ��� if�� �ƴ� else if ���. if���ص� ����� ������
		ó���������̱�*/

		else if( month >=6 && month <=8 )
			result = "����";
		else if( month >=9 && month <=11 )
			result = "����";

		System.out.println(month +" ����" +result+ " �Դϴ�.");
		
	}
}